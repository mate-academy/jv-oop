package core.basesyntax;

public abstract class Machine {
    private String nameMachine;

    public abstract void doWork();

    public abstract void stopWork();

    public String getNemeMachine() {
        return nameMachine;
    }

    public void setNameMachine(String nameMachine) {
        this.nameMachine = nameMachine;
    }
}
