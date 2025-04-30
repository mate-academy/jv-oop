package core.basesyntax;

public abstract class Machine {
    private String name;
    private boolean isWorking;

    public Machine(String name, boolean working) {
        this.name = name;
        this.isWorking = working;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWork(boolean work) {
        isWorking = work;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
