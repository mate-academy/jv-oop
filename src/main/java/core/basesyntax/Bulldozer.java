package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("The Bulldozer started working");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer stopped working");
    }
}
