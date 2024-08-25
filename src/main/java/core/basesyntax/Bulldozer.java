package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work and now it is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer finished all his tasks for today");
        System.out.println("Bulldozer stopped to work");
    }
}
