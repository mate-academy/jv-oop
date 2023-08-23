package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldozer is moving rocks...");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer stopped moving rocks.");
    }
}
