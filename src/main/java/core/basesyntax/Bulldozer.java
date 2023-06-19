package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozer work");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer stop work");
    }
}
