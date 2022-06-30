package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Bulldozer started work");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Bulldozer stopped work");
    }
}
