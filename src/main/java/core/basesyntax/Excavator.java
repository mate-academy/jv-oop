package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator machine stopped its work");
    }
}
