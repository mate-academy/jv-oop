package core.basesyntax;

class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck Start to Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck Stop Working");
    }
}
