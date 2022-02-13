package core.basesyntax;
public abstract class Machine {
    // Base options of machine
    private String typeMachine;
    public String getTypeMachine() {
        return typeMachine;
    }
    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }
    //Abstract methods:
    //Abstract method for work machine
    public abstract void doWork();
    //Abstract method for stop machine
    public abstract void stopWork();


}
