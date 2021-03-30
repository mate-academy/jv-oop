package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator starts to do something...");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator finished doing something.");
    }
}
