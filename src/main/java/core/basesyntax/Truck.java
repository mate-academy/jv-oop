package core.basesyntax;

public class Truck extends Machine {
    public Truck() {
        this.name = "Truck";
    }

    @Override
    public void doWork() {
        System.out.println(name + " starts working!");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " is finished for today!");
    }
}
