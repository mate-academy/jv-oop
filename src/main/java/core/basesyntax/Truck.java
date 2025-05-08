package core.basesyntax;

public class Truck extends Machine {
    private String name = "Truck";

    @Override
    public void doWork() {
        System.out.println(name + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped working");
    }
}
