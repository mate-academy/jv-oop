package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stopped working");
    }
}
