package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am excavator. I start working.");
    }

    @Override
    public void stopWork() {
        System.out.println("I am excavator. I have just finished.");
    }
}

