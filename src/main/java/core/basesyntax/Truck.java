package core.basesyntax;

public class Truck extends Machine {
    public Truck(String machineName) {
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
