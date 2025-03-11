class Battery {
    private int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

class Mobile {
    private Battery battery;

    public Mobile(int batteryCapacity) {
        this.battery = new Battery(batteryCapacity);
    }

    public int getBatteryCapacity() {
        return battery.getCapacity();
    }

    public void setBatteryCapacity(int batteryCapacity) {
        battery.setCapacity(batteryCapacity);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(4000);
        System.out.println("Mobile Battery Capacity: " + mobile.getBatteryCapacity() + "mAh");
        mobile.setBatteryCapacity(5000);
        System.out.println("Updated Mobile Battery Capacity: " + mobile.getBatteryCapacity() + "mAh");
    }
}
