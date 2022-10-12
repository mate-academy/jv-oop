package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String doWork() {
        return "Excavator started working";
    }

    @Override
    public String stopWork() {
        return "Excavator stopped work";
    }
}
