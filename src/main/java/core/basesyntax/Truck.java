package core.basesyntax;

public class Truck extends Machine {
    private final String name = "Truck";

    @Override
    public void doWork() {
        System.out.println(name + messageDoWork);
    }

    @Override
    public void stopWork() {
        System.out.println(name + messageStopWork);
    }
}
