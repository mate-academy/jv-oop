package core.basesyntax;

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator has started its work.");
    }

    public void stopWork() {
        System.out.println("Excavator has stopped working.");
    }
}
