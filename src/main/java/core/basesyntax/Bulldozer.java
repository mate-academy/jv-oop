package core.basesyntax;

public class Bulldozer extends Machine {
    public void setBulldozerOne(Machine bulldozerOne) {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer has started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working");
    }
}
