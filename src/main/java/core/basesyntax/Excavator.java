package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator is starting to do work!");
    }

    @Override
    public void doStop() {
        System.out.println("Excavator is stopping to do work!");
    }
}
