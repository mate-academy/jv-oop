package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator is work");
    }

    public void stopWork() {
        System.out.println("Excavator isn't work");
    }
}