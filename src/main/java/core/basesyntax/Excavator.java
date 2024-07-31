package core.basesyntax;
public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator is now working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped working");
    }
}