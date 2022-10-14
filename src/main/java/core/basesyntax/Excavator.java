package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String doWork() {
        return "Excavator is working";
    }
    @Override
    public String stopWork() {
        return "Excavator stopped working";
    }
}
