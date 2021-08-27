package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    public String stopWork() {
        return "Truck stopped its work";
    }
}
