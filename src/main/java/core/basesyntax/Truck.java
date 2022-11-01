package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "Truck started its work.";
    }

    @Override
    public String stopWork() {
        return "Truck stopped its work.";
    }
}
