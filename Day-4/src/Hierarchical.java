
// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child 1
class Car extends Vehicle {
    void openSunroof() {
        System.out.println("Car's sunroof opened.");
    }
}

// Child 2
class Bike extends Vehicle {
    void kickStart() {
        System.out.println("Bike is kick-started.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car car = new Car();
        car.openSunroof();
        car.start();

        Bike bike = new Bike();
        bike.kickStart();
        bike.start();


    }
}