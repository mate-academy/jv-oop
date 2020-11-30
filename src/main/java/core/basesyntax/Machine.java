package core.basesyntax;

public abstract class Machine {
    private String name;
    private int year;

    public Machine() {
    }

    public Machine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void doWork();

    public abstract void endWork();
}
