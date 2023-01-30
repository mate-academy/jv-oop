package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello, I'm truck: broom, broom");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped work");
    }
}
