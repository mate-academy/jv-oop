package core.basesyntax.garage;

public class Excavator extends Machine{
    public void doWork() {
        System.out.println("Excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
