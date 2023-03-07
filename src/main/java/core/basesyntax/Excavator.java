package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(super.getName() + " Excavator started working");
    }

    @Override
    public void stopWork() {
        System.out.println(super.getName() + " Excavator stopped working");
    }
}
