package core.basesyntax;

class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The truck starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has stopped working");
    }
}
