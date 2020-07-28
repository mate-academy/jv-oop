package core.basesyntax;

public abstract class Machine {
    String model;
    int speed;

    public Machine(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
