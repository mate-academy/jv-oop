package core.basesyntax;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("the Excavator is working");
    }
    @Override
    public void stopWork() {
        System.out.println("the Excavator is not working");
    }
}
