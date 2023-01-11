package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("The Bulldozer is started work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer is stopped work");
    }
}
