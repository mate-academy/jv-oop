package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The truck started loading the goods up.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck stopped loading the goods up.");
    }

}
