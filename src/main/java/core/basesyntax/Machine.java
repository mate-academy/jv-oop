package core.basesyntax;

public abstract class Machine {
    private String nameOfMachine;

    public void setName(String nameOfMachine) {
        this.nameOfMachine = nameOfMachine;
    }

    public String getNameOfMachine() {
        return nameOfMachine;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
