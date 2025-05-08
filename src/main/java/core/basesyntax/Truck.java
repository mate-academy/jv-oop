package core.basesyntax;

public class Truck extends Machines {

    @Override
    public String doWork() {
        return "Truck started it's work";
    }

    @Override
    public String stopWork() {
        return "Truck stopped it's work";
    }
}
