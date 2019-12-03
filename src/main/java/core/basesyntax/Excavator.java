package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void stopWork() {
        System.out.println("The Excavator go to work!");
    }

    @Override
    public void doWork() {
        System.out.println("The Excavator stopped work!");
    }
}
