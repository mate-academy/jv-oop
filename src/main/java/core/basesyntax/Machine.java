package core.basesyntax;

abstract class Machine {
    private String name;

    public String getName() {
        return name;
    }

    Machine(String name) {
        this.name = name;
    }

    public abstract void doWork();
    public abstract void stopWork();
}
