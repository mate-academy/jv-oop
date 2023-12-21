package core.basesyntax;

public abstract class Machine {

    private String model;

    public Machine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void doWork();

    public abstract void stopWork();

}
