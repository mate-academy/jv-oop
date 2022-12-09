package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator goes TRRRRR");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator stopped its work");
    }
}
