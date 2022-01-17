package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    protected void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    protected void stopWork() {
        System.out.println("Buldozer stopped its work");
    }
}
