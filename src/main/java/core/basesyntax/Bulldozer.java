package core.basesyntax;

public class Bulldozer extends Machine {
    Bulldozer (String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " machine started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " machines stopped working");
    }
}
