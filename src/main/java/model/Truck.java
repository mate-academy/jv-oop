package model;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is stopped to work");
    }
}
