package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer is starting to do work!");
    }

    @Override
    public void doStop() {
        System.out.println("Bulldozer is stopping to do work!");
    }
}
