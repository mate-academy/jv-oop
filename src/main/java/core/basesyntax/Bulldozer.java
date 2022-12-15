package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldozer is working now");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer stops working");
    }
}
