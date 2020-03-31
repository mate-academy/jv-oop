package core.basesyntax;

public class Track extends Machine {
    public Track(boolean state) {
        super(state);
    }

    @Override
    public void doWork() {
        if (!this.isState()) {
            this.setState(true);
            System.out.println("Track started working");
        } else {
            System.out.println("Track is already working");
        }
    }

    @Override
    public void stopWork() {
        if (this.isState()) {
            this.setState(false);
            System.out.println("Track stopped working");
        } else {
            System.out.println("Track is already stopped");
        }
    }
}
