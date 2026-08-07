package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {

    WeatherAlertService service = new WeatherAlertService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Location warsaw = Mockito.mock(Location.class);
    Location krakow = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void subscribedClientShouldReceiveNotificationForLocation() {
        service.addSubscriber(client, warsaw);

        service.sendNotificationToLocation(notification, warsaw);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotificationForLocation() {
        service.addSubscriber(client, warsaw);
        service.removeSubscriber(client, warsaw);

        service.sendNotificationToLocation(notification, warsaw);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void completelyUnsubscribedClientShouldNotReceiveAnyNotifications() {
        service.addSubscriber(client, warsaw);
        service.addSubscriber(client, krakow);

        service.removeSubscriberFromAll(client);

        service.sendNotificationToAll(notification);
        service.sendNotificationToLocation(notification, warsaw);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationForLocationShouldOnlyReachItsSubscribers() {
        service.addSubscriber(client, warsaw);
        service.addSubscriber(secondClient, krakow);

        service.sendNotificationToLocation(notification, warsaw);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationToAllShouldReachEveryoneExactlyOnce() {
        service.addSubscriber(client, warsaw);
        service.addSubscriber(client, krakow); // ten sam klient w dwóch miastach

        service.sendNotificationToAll(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void shouldBeAbleToRemoveLocationAndItsSubscriptions() {
        service.addSubscriber(client, warsaw);

        service.removeLocation(warsaw);
        service.sendNotificationToLocation(notification, warsaw);
        service.sendNotificationToAll(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}