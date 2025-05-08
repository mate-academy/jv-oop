package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String doWork() {
        return "Excavator started his work";
    }

    @Override
    public String stopWork() {
        return "Excavator stopped his work";
    }
}
