package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer was started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer did not work");
    }
}
