package core.basesyntax;

class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped to work");
    }
}
