package core.basesyntax;
class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started work");
    }

    @Override
    public void stopwork() {
        System.out.println("Excavastor stopped work");
    }
}
