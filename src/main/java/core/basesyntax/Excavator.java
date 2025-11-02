package core.basesyntax;

public class Excavator extends Machine {
    private final String currentClassName = getClass().getSimpleName();

    @Override
    public void doWork() {
        System.out.println(currentClassName + DO_WORK_MESSAGE);
    }

    @Override
    public void stopWork() {
        System.out.println(currentClassName + STOP_WORK_MESSAGE);
    }
}
