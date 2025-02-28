public class CarDemo {
    class Car {
        String make;
        String model;
        int year;
    }

    public void displayInfo() {
        Car myCar = new Car();
       myCar.make = "Toyota";
       myCar.model = "Corolla";
       myCar.year = 2020;
        System.out.println("Car: " + myCar.year + " " + myCar.model + " " + myCar.make);

    }

    public static void main(String[] args) {
        CarDemo demo = new CarDemo();
        demo.displayInfo();
    }
}
