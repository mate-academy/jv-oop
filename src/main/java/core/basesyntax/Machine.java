package core.basesyntax;

public abstract class Machine {

    private boolean isActive = false;

    public abstract void doWork();

    public abstract void stopWork();

    public boolean isActive() {
        System.out.println(isActive ? "You aren't my boss, but yes, I'm doing my job!" : "Can I have a break?");
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
