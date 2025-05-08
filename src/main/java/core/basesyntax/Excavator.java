package core.basesyntax;

public class Excavator extends Machine {
    private int excavatorNumber;

    public Excavator(int excavatorNumber) {
        this.excavatorNumber = excavatorNumber;
    }

    public int getExcavatorNumber() {
        return excavatorNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator #" + getExcavatorNumber() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator #" + getExcavatorNumber() + " finish work!");
    }
}
