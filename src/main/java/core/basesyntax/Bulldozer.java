package core.basesyntax;

public class Bulldozer extends Machin {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop work");
    }
}
