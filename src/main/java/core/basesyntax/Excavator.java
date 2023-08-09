package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String doWork() {
        return "Excavator" + super.doWork();
    }

    @Override
    public String stopWork() {
        return "Excavator" + super.stopWork();
    }
}
