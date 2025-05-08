package core.basesyntax.models;

public class Buldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozer has started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer has stopped its work");
    }
}
