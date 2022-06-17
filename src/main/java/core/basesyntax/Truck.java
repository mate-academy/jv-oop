package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        setTypeMachine("The truck");
        super.doWork();
    }

    @Override
    public void stopWork() {
        setTypeMachine("The truck");
        super.stopWork();
    }
}
