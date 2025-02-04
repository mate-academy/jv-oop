package core.basesyntax;

public abstract class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator is working");
    }
    @Override
    public void stopWork() {
        System.out.println("The truck is not working");
    }
}
