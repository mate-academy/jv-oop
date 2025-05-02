package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Excavator started his work");
        return false;
    }

    @Override
    public boolean stopWork() {
        System.out.println("Excavator stoped his work");
        return false;
    }

}
