package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started his work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped his work");
    }
}
