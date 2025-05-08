package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is ready to move mountains");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is tired");
    }
}
