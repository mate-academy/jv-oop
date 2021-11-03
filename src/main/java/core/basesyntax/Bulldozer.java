package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " start work!");

    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stop work!");
    }
}
