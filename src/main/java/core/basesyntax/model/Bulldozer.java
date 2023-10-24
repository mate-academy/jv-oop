package core.basesyntax.model;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stops working");
    }
}
