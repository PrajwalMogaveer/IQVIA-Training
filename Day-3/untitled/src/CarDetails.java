
class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class CarDetails {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Honda";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.year = 2022;


        car1.displayInfo();
        car2.displayInfo();
    }
}

