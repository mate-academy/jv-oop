package core.basesyntax;

public class Truck extends Machine {
    private String name = "Truck";

    @Override
    public void doWork() {
        System.out.println(name + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped its work");
    }
}
