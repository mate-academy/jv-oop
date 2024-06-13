package core.basesyntax;

public abstract class Machine {
    private String nameMachine;

    public Machine(String nameMachine) {
        this.nameMachine = nameMachine;
    }

    public String getNameMachine() {
        return nameMachine;
    }

    public void setNameMachine(String nameMachine) {
        this.nameMachine = nameMachine;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
