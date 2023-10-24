package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "Truck has started  work";
    }

    @Override
    public String stopWork() {
        return "Truck has stopped  work";
    }
}
