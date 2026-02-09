package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String excavatorName) {
        this.name = excavatorName;
    }
    @Override
    public void doWork() {
        System.out.println("Machine " + name + " is working");
    }
    @Override
    public void stopWork() {
        System.out.println("Machine " + name + " is not working");
    }
}
