package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String name) {
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
