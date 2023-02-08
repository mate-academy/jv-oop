package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck began to move cargo.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck delivered cargo.");
    }
}
