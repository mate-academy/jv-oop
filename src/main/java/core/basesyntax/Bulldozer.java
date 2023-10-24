package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer started to do the work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stop work");
    }
}
