package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator began work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator has finished its work.");
    }
}
