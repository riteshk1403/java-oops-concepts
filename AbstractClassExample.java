abstract class Vehicle {

    abstract void start();   // abstract method

    void fuel() {             // concrete method
        System.out.println("Vehicle needs fuel");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        Vehicle v = new Bike();
        v.start();
        v.fuel();
    }
}
