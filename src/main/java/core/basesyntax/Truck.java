package core.basesyntax;

public class Truck extends Machine {
    private String name;

    public Truck(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped its work.");
    }
}
