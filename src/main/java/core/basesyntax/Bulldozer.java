package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer is pushing earth or debris.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped pushing earth or debris");
    }
}
