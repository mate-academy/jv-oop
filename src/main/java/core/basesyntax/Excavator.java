package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String doWork() {
        return "Excavator has started  work";
    }

    @Override
    public String stopWork() {
        return "Excavator has stopped  work";
    }
}
