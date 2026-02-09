package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String excavatorName) {
        this.name = excavatorName;
    }

    @Override
    public void doWork() {
        System.out.println(name + " started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped working.");
    }
}
