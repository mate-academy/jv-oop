package core.basesyntax;

public abstract class Machine {
    private String typeMachine = "";

    public String getTypeMachine() {
        return typeMachine;
    }

    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }

    public void doWork() {
        String messageDoWork = " started its work.";
        System.out.println(typeMachine + messageDoWork);
    }

    public void stopWork() {
        String messageStopWork = " stopped its work.";
        System.out.println(typeMachine + messageStopWork);
    }
}
