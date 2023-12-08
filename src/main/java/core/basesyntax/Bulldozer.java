package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String name, boolean work) {
        setName(name);
        setWork(work);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer: " + getName() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer: " + getName() + " stop work!");
    }
}
