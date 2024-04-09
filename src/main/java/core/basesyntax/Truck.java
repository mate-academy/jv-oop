package core.basesyntax;

public class Truck extends Machine {
    private int truck;

    public Truck(int truck) {
        this.truck = truck;
    }

    public int getTruck() {
        return truck;
    }

    public void setTruck() {
        this.truck = truck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck #" + getTruck() + " start work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck #" + getTruck() + " stop work.");
    }
}
