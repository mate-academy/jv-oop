package core.basesyntax;

public class Bulldozer extends Machine {

    int ladleCapacity;

    public Bulldozer(int enginePower, int tankVolume, boolean isFixed, int ladleCapacity) {
        super(enginePower, tankVolume, isFixed);
        this.ladleCapacity = ladleCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("The bulldozer started digging up a quarry.");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped digging up a quarry.");
    }
}
