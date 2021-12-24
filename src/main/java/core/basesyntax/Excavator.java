package core.basesyntax;
public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("An Excavator is started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("An Excavator is stopped its work");
    }
}
