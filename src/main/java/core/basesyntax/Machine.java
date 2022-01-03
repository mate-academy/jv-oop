package core.basesyntax;

public abstract class Machine {
    String name;

    public Machine(String name) {
        this.name = name;
    }

    public abstract void doWork();

    public abstract void stopWork();
}