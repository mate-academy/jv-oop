package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("it's a Excavator that works");
    }

    @Override
    public void stopWork() {
        System.out.println("is a Excavator that does not work");
    }
}
