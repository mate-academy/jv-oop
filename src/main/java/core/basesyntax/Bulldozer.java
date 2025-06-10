package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Attention, the Bulldozer will start working soon");
    }

    @Override
    public void stopWork() {
        System.out.println("Attention, the Bulldozer will stop working soon");
    }
}
