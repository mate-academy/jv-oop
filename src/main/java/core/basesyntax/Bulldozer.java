package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.printf("Bulldozer started its work.");
    }

    @Override
    public void stopWork() {
        System.out.printf("Bulldozer stopped its work.");
    }
}
