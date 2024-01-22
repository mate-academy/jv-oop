package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machines are working");
    }

    @Override
    public void stopWork() {
        System.out.println("Machines stopped working");
    }
}
