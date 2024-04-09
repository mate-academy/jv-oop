package core.basesyntax;

public class Truck extends Machine {
    private int number;

    public Truck(int number) {
        this.number = number;
    }

    public int getTruck() {
        return number;
    }

    public void setTruck() {
        this.number = number;
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
