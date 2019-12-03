package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am a Excavator and I started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("I am a Excavator and I stoped to work");
    }
}
