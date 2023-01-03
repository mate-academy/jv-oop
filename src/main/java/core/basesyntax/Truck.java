package core.basesyntax;

public class Truck extends Machine {
    public String getStartMessage() {
        return "Truck start working";
    }

    public String getStopMessage() {
        return "Truck stop working";
    }

    @Override
    public void doWork() {
        System.out.println(getStartMessage());
    }

    @Override
    public void stopWork() {
        System.out.println(getStopMessage());
    }
}
