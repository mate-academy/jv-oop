package core.basesyntax;

public class Excavator extends Machine { //class Excavator extended from abstract Machine

    @Override
    public void doWork() { //overridden from abstract method to print Excavator's start
        System.out.println("Excavator starts working");
    }

    @Override
    public void stopWork() { //overridden from abstract method to print Excavator's stop
        System.out.println("Excavator stops working");
    }
}
