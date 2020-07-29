package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator started its way to the marshes.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped its way to the marshes.");
    }

}
