package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("A excavator starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("A excavator stop working");
    }
}