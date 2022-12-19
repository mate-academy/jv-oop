package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stopped its work");
    }
}
