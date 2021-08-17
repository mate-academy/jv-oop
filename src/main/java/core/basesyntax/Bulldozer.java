package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer" + super.getName() + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer" + super.getName() + " stopped its work.");
    }
}
