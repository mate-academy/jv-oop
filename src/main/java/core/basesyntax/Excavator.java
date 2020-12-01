package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("I`m excavating!");
    }

    @Override
    public void stopWork() {
        System.out.println("Turned OFF.");
    }
}
