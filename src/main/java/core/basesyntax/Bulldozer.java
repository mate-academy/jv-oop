package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("A bulldozer started doing its work");
    }

    @Override
    public void stopWork() {
        System.out.println("A bulldozer stopped doing it's work");
    }
}
