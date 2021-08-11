package core.basesyntax;

abstract class Machine {
    private String model;
    private int id;

    public Machine(String model, int id) {
        this.model = model;
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public abstract void doWork();
    public abstract void stopWork();

}
