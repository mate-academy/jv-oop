package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator " + getName() + " machine started its work.");
    }

    @Override
    public void doStopWork() {
        System.out.println("Excavator " + getName() + " machine stopped its work.");
    }
}
