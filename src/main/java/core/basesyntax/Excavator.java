package core.basesyntax;

public class Excavator extends Machine {
    protected String machineName = "Excavator";

    @Override
    public void doWork() {
        System.out.print(machineName + " is working!");
    }

    @Override
    public void stopWork() {
        System.out.print(machineName + " just stopped to work!");
    }

    @Override
    public void getName(String name) {
        machineName = name;
    }
}
