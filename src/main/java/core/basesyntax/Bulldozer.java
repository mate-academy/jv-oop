package core.basesyntax;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " start work");
    }

    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " stop work");
    }
}
