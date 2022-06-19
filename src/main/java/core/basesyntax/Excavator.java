package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator finished work");
    }
}
