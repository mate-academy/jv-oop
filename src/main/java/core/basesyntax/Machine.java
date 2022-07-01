package core.basesyntax;

public abstract class Machine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
