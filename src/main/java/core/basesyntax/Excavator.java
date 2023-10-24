package core.basesyntax;

public class Excavator extends Machine {
    private final String name = "Excavator";

    @Override
    public void doWork() {
        System.out.println(name + messageDoWork);
    }

    @Override
    public void stopWork() {
        System.out.println(name + messageStopWork);
    }
}
