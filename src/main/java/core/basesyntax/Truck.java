package core.basesyntax;

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is transporting goods.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped transporting goods.");
    }
}
