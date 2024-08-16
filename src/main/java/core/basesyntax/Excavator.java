package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String name) {
        super(name);
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator is working");
    }
}
