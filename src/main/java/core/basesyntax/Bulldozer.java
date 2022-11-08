package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am a Bulldozer");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer tired");
    }
}
