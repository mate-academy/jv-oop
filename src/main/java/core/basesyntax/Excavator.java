package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.printf("%s is started work \n", getClass().getSimpleName());
    }

    @Override
    public void stopWork() {
        System.out.printf("%s is ended work \n", getClass().getSimpleName());
    }
}
