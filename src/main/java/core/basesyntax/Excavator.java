package core.basesyntax;

public class Excavator extends Machine{
    private final String machineName;
    public Excavator(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public void doWork() {
        System.out.println(machineName + " started its work!");
    }

    @Override
    public void stopWork() {
        System.out.println(machineName + " stopped its work!");
    }
}
