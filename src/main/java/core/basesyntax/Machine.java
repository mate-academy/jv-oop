package core.basesyntax;

public abstract class Machine {

    private boolean isActive = false;

    public abstract void doWork();

    public abstract void stopWork();

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
