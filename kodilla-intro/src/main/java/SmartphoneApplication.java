public class SmartphoneApplication {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone(48);
        int batteryLevel = smartphone.getBatteryLevel();
        System.out.println("Twoj stan baterii to: " + batteryLevel);

        smartphone.setBatteryLevel(100);

        batteryLevel = smartphone.getBatteryLevel();
        System.out.println("Twoj nowy stan baterii to: " + batteryLevel);
    }
}