package core.basesyntax;

public class Excavator extends Machine{

    @Override
    public void doWork() {
System.out.println("Excalator started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excalator stopped its work.");
    }
}
