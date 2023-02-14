package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public boolean doWork() {
        System.out.println("Excavator started working");
        return false;
    }

    public void stopWork() {
        System.out.println("Excavator started working");
    }
}
