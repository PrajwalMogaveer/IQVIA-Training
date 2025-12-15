
interface Appliance {
    void turnOn();
    void turnOff();
}

class Fan implements Appliance {
    public void turnOn() {
        System.out.println("Fan starting...");
    }

    public void turnOff() {
        System.out.println("Fan stopping...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Appliance a = new Fan();
        a.turnOn();
        a.turnOff();
    }
}
