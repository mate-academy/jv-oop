package core.basesyntax;

public abstract class Machine {
    private String name;
    private int year;

    public Machine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
