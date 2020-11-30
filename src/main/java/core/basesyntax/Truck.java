package core.basesyntax;

public class Truck extends Machine {
    private int maxLoad;

    public Truck(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public void doWork() {
        System.out.println("Truck start to work");
    }

    public void endWork() {
        System.out.println("Truck finished work");
    }
}
