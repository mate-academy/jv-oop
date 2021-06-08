package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("start work");
    }

    @Override
    public void stopWork() {
        System.out.println("stop work");
    }
}
