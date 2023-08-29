package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void dowork() {
        System.out.println("Excavator started its work.");
    }

    @Override
    public void stopwork() {
        System.out.println("Excavator stopped its work.");
    }
}
