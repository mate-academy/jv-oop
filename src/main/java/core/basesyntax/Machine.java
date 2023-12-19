package core.basesyntax;

 abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
    public void start() {
        System.out.println("Start");
    }
}
