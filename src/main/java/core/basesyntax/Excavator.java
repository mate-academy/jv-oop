package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getName() + " start work !");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getName() + " stop work !");
    }
}
