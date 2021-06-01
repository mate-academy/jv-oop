package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {

        System.out.println("\nBulldozer is starting it's work now!\n");

    }

    @Override
    public void stopWork() {

        System.out.println("\nBulldozer is not available now!\n");

    }

}
