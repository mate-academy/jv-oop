package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer начала свою работу");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer закончил свою работу");
    }
}
