package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(boolean state) {
        super(state);
    }

    @Override
    public void doWork() {
        if (!this.isState()) {
            this.setState(true);
            System.out.println("Excavator started working");
        } else {
            System.out.println("Excavator is already working");
        }
    }

    @Override
    public void stopWork() {
        if (this.isState()) {
            this.setState(false);
            System.out.println("Excavator stopped working");
        } else {
            System.out.println("Excavator is already stopped");
        }
    }
}
