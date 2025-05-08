package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer has started the work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has finished the work");
    }
}
