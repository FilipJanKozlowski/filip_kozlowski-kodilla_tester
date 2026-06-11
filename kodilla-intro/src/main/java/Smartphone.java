public class Smartphone {
    private int batteryLevel;

    public Smartphone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int newLevel) {
        this.batteryLevel = newLevel;
    }
}