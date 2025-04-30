package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String name, boolean working) {
        super(name, working);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator: " + getName() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator: " + getName() + " stop work!"); ;
    }
}
