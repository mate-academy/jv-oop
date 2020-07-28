package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Wru-u-u-m, Bulldozer is ready!");
    }

    @Override
    public void stopWork() {
        System.out.println("Everything demolished, Master! Bulldozer is chilling now.");
    }
}
