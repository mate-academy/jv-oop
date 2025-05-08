package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stopped its work");
    }
}
