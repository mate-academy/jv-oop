package core.basesyntax;

public abstract class Machine {
    private final String name;

    Machine (String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract void doWork();

    public abstract void stopWork();

}
