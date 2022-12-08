package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm Excavator! I'm starting!");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm Excavator! I'm stopping.");
    }
}
