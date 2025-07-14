package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " is pushing.");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " has stopped pushing.");
    }
}
