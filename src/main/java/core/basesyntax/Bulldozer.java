package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("zap zap");
    }

    @Override
    public void stopWork() {
        System.out.println("at last!");
    }
}
