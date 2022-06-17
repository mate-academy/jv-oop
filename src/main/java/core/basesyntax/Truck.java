package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        typeMachine = "The truck";
        super.doWork();
    }

    @Override
    public void stopWork() {
        typeMachine = "The truck";
        super.stopWork();
    }

}
