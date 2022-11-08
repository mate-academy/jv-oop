package core.basesyntax;

public class Truck extends Machine {
    @Override
    public String doWork() {
        return "I am Truck";
    }

    @Override
    public String stopWork() {
        return "Truck tire";
    }
}
