package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        setTypeMachine("The excavator");
        super.doWork();
    }

    @Override
    public void stopWork() {
        setTypeMachine("The excavator");
        super.stopWork();
    }

}
