package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer start work");
    }

    public void stopWork() {
        System.out.println("Bulldozer stop work");
    }
}
