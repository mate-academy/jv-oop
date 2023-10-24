package core.basesyntax;

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator Start to Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator Stop Working");
    }
}
