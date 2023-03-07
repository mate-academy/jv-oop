package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " The Excavator began its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " The Excavator has finished its work");
    }
}
