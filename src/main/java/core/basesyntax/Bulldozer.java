package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(boolean state) {
        super(state);
    }

    @Override
    public void doWork() {
        if (!this.isState()) {
            this.setState(true);
            System.out.println("Bulldozer started working");
        } else {
            System.out.println("Bulldozer is already working");
        }
    }

    @Override
    public void stopWork() {
        if (this.isState()) {
            this.setState(false);
            System.out.println("Bulldozer stopped working");
        } else {
            System.out.println("Bulldozer is already stopped");
        }
    }
}
