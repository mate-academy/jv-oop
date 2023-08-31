package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void work() {
        System.out.println("Excavator stated its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped its work!");
    }
}
