package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " Start");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " Stop");
    }
}
