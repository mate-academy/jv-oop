package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("that a certain machine started its work.");
    }

    @Override
    public void stopWork() {
System.out.println(" that certain machines stopped working.");
    }
}
