package core.basesyntax;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer started is work!!!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work!!!");
    }
}
