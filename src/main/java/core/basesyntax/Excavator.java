package core.basesyntax;

public class Excavator extends Machine {
    private int number;

    public Excavator(int number) {
        this.number = number;
    }

    public int getExcavator() {
        return number;
    }

    public void setExcavator() {
        this.number = number;
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
