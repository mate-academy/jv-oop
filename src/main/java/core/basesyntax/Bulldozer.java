package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("A bulldozer is working!");
    }

    @Override
    public void stopWork() {
        System.out.println("A bulldozer is stopped!");
    }
}
