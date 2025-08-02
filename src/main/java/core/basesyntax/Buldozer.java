package core.basesyntax;

public class Buldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozer has started the work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer has stopped the work.");
    }
}
