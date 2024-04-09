package core.basesyntax;

public class Excavator extends Machine {
    private int excavator;

    public Excavator(int excavator) {
        this.excavator = excavator;
    }

    public int getExcavator() {
        return excavator;
    }

    public void setExcavator() {
        this.excavator = excavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator #" + getExcavator() + " start work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator #" + getExcavator() + " stop work.");
    }
}
