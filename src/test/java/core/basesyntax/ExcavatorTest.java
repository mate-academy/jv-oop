package core.basesyntax;

class ExcavatorTest extends MachineTest {

    @Override
    public void doWork() {
        System.out.println("Excavator started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working.");
    }
}