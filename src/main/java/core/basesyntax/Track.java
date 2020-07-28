package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("A track started doing its work");
    }

    @Override
    public void stopWork() {
        System.out.println("A track stopped doing it's work");
    }
}
