package core.basesyntax;

public class Excavator extends Machine{

    @Override
    public void doWork() {
        typeMachine = "The excavator";
        super.doWork();
    }

    @Override
    public void stopWork() {
        typeMachine = "The excavator";
        super.stopWork();
    }

}
