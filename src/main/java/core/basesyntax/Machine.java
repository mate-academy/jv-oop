package core.basesyntax;

abstract class Machine {
    public String name;

    public Machine() {
        this.name = this.getClass().getSimpleName();
    }

    public abstract void doWork();

    public abstract void stopWork();
}
