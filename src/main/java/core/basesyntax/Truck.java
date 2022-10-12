package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "Truck started working";
    }

    @Override
    public String stopWork() {
        return "Truck stopped work";
    }
}
