package core.basesyntax;

public abstract class Machine {
    private String name;

    public Machine(String name) {
        this.name = name;
    }

    public abstract void doWork();

    public abstract void stopWork();

    public String getName() {
        return name;
    }
}
