package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The engine started. The Bulldozer is driving.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer stopped. Turn off the engine.");
    }
}
