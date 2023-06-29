package core.basesyntax;

public class Buldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozer starts work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer stops work!");
    }
}
