package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "Truck is working";
    }

    @Override
    public String stopWork() {
        return "Truck stopped working";
    }
}
