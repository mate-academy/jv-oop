package core.basesyntax;

public abstract class Machine {

    public abstract void doWork();

    public abstract void stopWork();

    public void printStartMessage(String message) {
        System.out.println(message + " started working");
    }

    public void printStopMessage(String message) {
        System.out.println(message + " stopped working");
    }
}
