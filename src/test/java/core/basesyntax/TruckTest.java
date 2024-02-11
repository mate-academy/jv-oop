package core.basesyntax;

class TruckTest extends MachineTest {

    @Override
    public void doWork() {
        System.out.println("Truck started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working.");
    }
}