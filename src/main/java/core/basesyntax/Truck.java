package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The truck starts to do something...");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck finished doing something.");
    }
}
