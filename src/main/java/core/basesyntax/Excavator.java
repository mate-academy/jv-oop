package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Excavator started his work");
        return true;
    }

    @Override
    public boolean stopWork() {
        System.out.println("Excavator stopped his work");
        return true;
    }

}
