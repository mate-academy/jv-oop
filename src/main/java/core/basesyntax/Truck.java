package core.basesyntax;

public class Truck extends Machine {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void doWork() {
        System.out.println("A truck " + this.name + " started its work");
    }

    public void stopWork() {
        System.out.println("A truck " + this.name + " stopped its work");
    }
}
