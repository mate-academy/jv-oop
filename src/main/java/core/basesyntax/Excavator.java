package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String machineTitle) {
        super(machineTitle);
    }

    @Override
    public void doWork() {
        System.out.println(getMachineTitle() + " is working!");
    }

    @Override
    public void stopWork() {
        System.out.println(getMachineTitle() + " is doing nothing!");
    }
}
