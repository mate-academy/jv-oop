package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Bulldozer start to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Bulldozer stop to work");
    }
}
