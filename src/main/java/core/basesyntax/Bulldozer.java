package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Sir Bulldozer started his work for today.");
    }

    @Override
    public void stopWork() {
        System.out.println("Sir Bulldozer's working day is over!");
    }
}
