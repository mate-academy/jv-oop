package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Bulldozer started working");

    }

    @Override
    public void stopWork() {
        System.out.println("This Bulldozer has stopped working");
    }
}
