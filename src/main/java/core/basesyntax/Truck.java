package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "Truck started his work";
    }

    @Override
    public String stopWork() {
        return "Truck stopped his work";
    }
}
