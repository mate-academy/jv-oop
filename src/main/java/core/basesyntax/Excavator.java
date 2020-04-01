package core.basesyntax;

public class Excavator extends Machine {
    public void setExcavatorOne(Machine excavatorOne) {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator has started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
