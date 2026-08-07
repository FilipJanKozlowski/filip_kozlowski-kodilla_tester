package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private Map<Location, Set<Client>> subscriptions = new HashMap<>();

    public void addSubscriber(Client client, Location location) {
        if (!subscriptions.containsKey(location)) {
            subscriptions.put(location, new HashSet<>());
        }
        subscriptions.get(location).add(client);
    }

    public void removeSubscriber(Client client, Location location) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location).remove(client);
        }
    }

    public void removeSubscriberFromAll(Client client) {
        for (Set<Client> clients : subscriptions.values()) {
            clients.remove(client);
        }
    }

    public void sendNotificationToLocation(Notification notification, Location location) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location).forEach(currentClient -> currentClient.receive(notification));
        }
    }

    public void sendNotificationToAll(Notification notification) {
        Set<Client> allClients = new HashSet<>();
        for (Set<Client> clients : subscriptions.values()) {
            for (Client currentClient : clients) {
                allClients.add(currentClient);
            }
        }
        allClients.forEach(currentClient -> currentClient.receive(notification));
    }

    public void removeLocation(Location location) {
        subscriptions.remove(location);
    }
}