package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("A long road is waiting");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm staying in a middle of nowhere, cause navigator is crashed");
    }

}
