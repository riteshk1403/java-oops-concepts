class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();   // Vehicle
        ec.drive();   // Car
        ec.charge();  // ElectricCar
    }
}

