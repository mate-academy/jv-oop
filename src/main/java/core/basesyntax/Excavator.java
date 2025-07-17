package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String toString() {
        return super.toString();
    }

    public void doWork() {
        System.out.println("Excavator started working");
    }

    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}


