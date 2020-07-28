package core.basesyntax;

public class Truck extends Machine {

    int remainingCapacity;

    public Truck(int enginePower, int tankVolume, boolean isFixed, int remainingCapacity) {
        super(enginePower, tankVolume, isFixed);
        this.remainingCapacity = remainingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("The truck started loading the goods up.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck stopped loading the goods up.");
    }

}
