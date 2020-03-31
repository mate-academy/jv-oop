package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(name + " work started");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " work finished");
    }
}
