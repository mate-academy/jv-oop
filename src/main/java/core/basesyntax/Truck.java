package core.basesyntax;

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work.");
    }

    public void stopWork() {
        System.out.println("Truck has stopped working.");
    }
}

