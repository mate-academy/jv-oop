package core.basesyntax;

public class Excavator extends Machines {
    @Override
    public void doWork() {
        System.out.println("Excavator start to working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop working");
    }
}
