package core.basesyntax;

public class Track extends Machine {
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " start work");
    }

    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " stop work");
    }
}
