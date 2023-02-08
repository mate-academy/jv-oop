package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am truck. I start working. Wish you good luck!");
    }

    @Override
    public void stopWork() {
        System.out.println("I am truck. I finished working. Thanks a lot.");
    }
}

