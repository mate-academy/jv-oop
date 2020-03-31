package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm work!!!");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm don't work");
    }
}
