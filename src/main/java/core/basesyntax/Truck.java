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
        System.out.println("Truck start working");
    }

    @Override
    public void stopWork() {
        System.out.println(getStopMessage());
        System.out.println("Truck stop working");
    }
}
