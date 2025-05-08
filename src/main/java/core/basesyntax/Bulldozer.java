package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer is already working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer is not working.");
    }
}
