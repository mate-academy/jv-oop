package core.basesyntax;

public class Buldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Buldozer does work");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer stops work");
    }
}
