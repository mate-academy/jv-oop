package core.basesyntax;

public abstract class Machine {
    public String machineName;

    public Machine(String machineName){
        this.machineName = machineName;
    }

    public abstract void doWork();
    public abstract void stopWork();
}
