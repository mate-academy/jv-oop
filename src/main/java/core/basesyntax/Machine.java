package core.basesyntax;

public abstract class Machine {
    private String name;
    private boolean isWork;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
