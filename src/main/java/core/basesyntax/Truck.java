package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm truck. I start working.");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm truck. I finished working.");
    }
}

