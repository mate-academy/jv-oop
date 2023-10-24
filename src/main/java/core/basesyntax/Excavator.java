package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stops working");
    }
}
