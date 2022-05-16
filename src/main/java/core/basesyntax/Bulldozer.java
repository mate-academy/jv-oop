package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Work buldozzer");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop worked buldozzer");
    }
}
