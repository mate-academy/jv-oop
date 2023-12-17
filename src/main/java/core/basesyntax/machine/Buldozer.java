package core.basesyntax.machine;

public class Buldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Boldozer start work");
    }

    @Override
    public void stopWork() {
        System.out.println("Boldozer stop work");
    }
}
