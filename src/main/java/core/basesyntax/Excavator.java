package core.basesyntax;

public class Excavator extends Machine {
    public String doWork() {
        return "Excavator" + super.doWork();
    }

    public String stopWork() {
        return "Excavator" + super.stopWork();
    }
}
