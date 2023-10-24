package core.basesyntax;

class Excavator extends Machine {
    @Override
    public void doWork() {

        System.out.println("Excavator has started working.");
    }

    @Override
    public void stopWork() {

        System.out.println("Excavator has stopped working.");
    }
}
