package core.basesyntax;

public class Truck extends Machine {
    private int capasity;

    public Truck() {
    }

    public Truck(String brandMachine, String modelMachine, int capasity) {
        super(brandMachine, modelMachine);
        this.capasity = capasity;
    }

    @Override
    public void doWork() {
        System.out.println("The truck " + getBrand() + " " + getModel()
                + " received " + getCapasity()
                + " cubes of crushed stone for an order to transport.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck " + getBrand() + " " + getModel()
                + "returned from the trip to the garage.");
    }

    public int getCapasity() {
        return capasity;
    }
}

