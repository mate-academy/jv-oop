package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        typeMachine = "The bulldozer";
        super.doWork();
    }

    @Override
    public void stopWork() {
        typeMachine = "The bulldozer";
        super.stopWork();
    }

}
