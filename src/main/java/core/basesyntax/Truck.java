package core.basesyntax;

public class Truck extends Machine {
    private String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " start to work");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stop to work");
    }
}
