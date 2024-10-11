package core.basesyntax;

public abstract class Machine {
    public abstract void doWork() ;
    public void stopWork() {
        System.out.println("Machine stop working");
    }
}
