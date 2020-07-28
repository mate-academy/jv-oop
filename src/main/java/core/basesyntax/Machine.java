package core.basesyntax;

public abstract class Machine {

    int enginePower;
    int tankVolume;
    boolean isFixed;

    public Machine(int enginePower, int tankVolume, boolean isFixed) {
        this.enginePower = enginePower;
        this.tankVolume = tankVolume;
        this.isFixed = isFixed;
    }

    public abstract void doWork();

    public abstract void stopWork();

}
