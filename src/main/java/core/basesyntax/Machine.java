package core.basesyntax;

public abstract class Machine {

    private boolean state;

    public Machine(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
