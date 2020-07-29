package core.basesyntax;

public class Track extends Machine {

    public Track(String machineTitle) {
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
