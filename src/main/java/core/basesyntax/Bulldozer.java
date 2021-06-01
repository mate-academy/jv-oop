package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("go to work");
    }

    @Override
    public void stopWork() {
        System.out.println("STOP to work");
    }
}
