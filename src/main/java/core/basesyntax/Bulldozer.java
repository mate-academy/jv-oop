package core.basesyntax;


public class Bulldozer extends Machine {
    private final String name = "Bulldozer";

    @Override
    public void doWork() {
        System.out.println(name + messageDoWork);
    }

    @Override
    public void stopWork() {
        System.out.println(name + messageStopWork);
    }
}
