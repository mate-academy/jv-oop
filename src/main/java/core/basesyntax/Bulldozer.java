package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String machineName) {
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
