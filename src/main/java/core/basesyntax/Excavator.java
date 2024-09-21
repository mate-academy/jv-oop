package core.basesyntax;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator started its engine and began to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator turned off its engine and stopped working.");
    }
}
