package core.basesyntax;

public abstract class Machine {
    // --Commented out by Inspection (26//
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void doWork();
    public abstract void stopWork();
}
