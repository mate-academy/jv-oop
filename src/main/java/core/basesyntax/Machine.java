package core.basesyntax;

public abstract class Machine {
    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
