package core.basesyntax.garage;

public class Excavator extends Machine{
    public void doWork() {
        System.out.println("excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("excavator stopped working");
    }
}
