package core.basesyntax;

public abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
