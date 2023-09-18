package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Start work");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work");
    }
}
