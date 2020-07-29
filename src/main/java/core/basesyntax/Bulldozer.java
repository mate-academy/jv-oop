package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String machineTitle) {
        super(machineTitle);
    }

    @Override
    public void doWork() {
        System.out.println(this.getMachineTitle() + " is working!");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getMachineTitle() + " is doing nothing!");
    }
}
