package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() { System.out.println("Volvo: " + getPositiveStatus());

    }

    @Override
    public void stopWork() {
        System.out.println("Volvo: " + getNegativeStatus());
    }
}
