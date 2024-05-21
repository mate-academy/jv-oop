package core.basesyntax;

class Truck extends Machine {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop working");
    }
}
