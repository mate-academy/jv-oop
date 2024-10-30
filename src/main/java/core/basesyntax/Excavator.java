package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator has started digging trenches "
                + "and breaking holes to lifting away waste and excavating mines.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator has stopped digging trenches "
                + "and breaking holes to lifting away waste and excavating mines.");
    }
}
