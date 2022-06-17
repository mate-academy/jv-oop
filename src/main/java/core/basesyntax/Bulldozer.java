package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        setTypeMachine("The bulldozer");
        super.doWork();
    }

    @Override
    public void stopWork() {
        setTypeMachine("The bulldozer");
        super.stopWork();
    }
}
