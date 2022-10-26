package core.basesyntax;

public class Truck extends Machine { //class Truck extended from abstract Machine

    @Override
    public void doWork() { //overridden from abstract method to print Truck's start
        System.out.println("Truck starts working");
    }

    @Override
    public void stopWork() { //overridden from abstract method to print Truck's stop
        System.out.println("Truck stops working");
    }
}
