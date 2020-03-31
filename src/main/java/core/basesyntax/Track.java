package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Track starts to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Track stops work.");
    }
}
