package core.basesyntax;

public class Truck extends Machine {

    @Override
    public String goWork() {
        return "Truck started its work!";
    }

    @Override
    public String stopWork() {
        return "Truck stopped its work!";
    }
}
