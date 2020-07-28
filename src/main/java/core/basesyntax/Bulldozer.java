package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String machineTitle) {
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
