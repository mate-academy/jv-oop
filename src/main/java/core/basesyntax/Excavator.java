package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String machineName) {
        this.setMachineName(machineName);
    }

    @Override
    public void doWork() {
        System.out.println("Machine " + this.getMachineName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine " + this.getMachineName() + " stopped its work");
    }
}
