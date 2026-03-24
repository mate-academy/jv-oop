package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(Excavator.class.getSimpleName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(Excavator.class.getSimpleName() + " stopped working");
    }
}
