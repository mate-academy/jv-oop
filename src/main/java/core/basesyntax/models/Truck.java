package core.basesyntax.models;

public class Truck extends Machine {

    public Truck() {

    }

    @Override
    public void doWork() {

        System.out.println("Truck started to work");

    }

    @Override
    public void stopWork() {

        System.out.println("Truck stopped working");

    }

}
