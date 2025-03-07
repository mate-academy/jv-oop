package core.basesyntax;

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working.");
    }
}