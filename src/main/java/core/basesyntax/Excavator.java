package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am a excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("excavator tired");
    }
}
