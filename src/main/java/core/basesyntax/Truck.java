package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The engine started. The Truck is driving.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck stopped. Turn off the engine.");
    }
}
