package core.basesyntax.model;

public abstract class Machine {
    private String typeOfMmachine;

    public String getTypeOfMmachine() {
        return typeOfMmachine;
    }

    public void setTypeOfMmachine(String typeOfMmachine) {
        this.typeOfMmachine = typeOfMmachine;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
