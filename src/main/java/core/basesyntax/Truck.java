package core.basesyntax;

public class Truck extends Machine {
    public String doWork() {
        return "Truck" + super.doWork();
    }

    public String stopWork() {
        return "Truck" + super.stopWork();
    }
}
