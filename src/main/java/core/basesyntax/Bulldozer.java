package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Status machine: Bulldozer started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Status machine: Bulldozer stopped its work");
    }
}
