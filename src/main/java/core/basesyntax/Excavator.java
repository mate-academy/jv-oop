package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " have just started working");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getSimpleName() + " have just stopped working");
    }
}
