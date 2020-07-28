package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String machineTitle) {
        super(machineTitle);
    }

    @Override
    public void doWork() {
        System.out.println(this.machineTitle + " is working!");
    }

    @Override
    public void stopWork() {
        System.out.println(this.machineTitle + " is doing nothing!");
    }
}
