package core.basesyntax;

public abstract class Machine {
    private String nameOfTheMachine;

    public Machine(String nameOfTheMachine) {
        this.nameOfTheMachine = nameOfTheMachine;
    }

    public abstract void doWork();

    public abstract void stopWork();

    public String getNameOfTheMachine() {
        return nameOfTheMachine;
    }

    public void setNameOfTheMachine(String nameOfTheMachine) {
        this.nameOfTheMachine = nameOfTheMachine;
    }
}
