package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer Works!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer Stops working!");
    }
}
