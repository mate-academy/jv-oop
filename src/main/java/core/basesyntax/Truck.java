package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "Truck" + super.doWork();
    }

    @Override
    public String stopWork() {
        return "Truck" + super.stopWork();
    }
}
