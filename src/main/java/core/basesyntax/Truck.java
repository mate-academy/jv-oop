package core.basesyntax;

public class Truck extends Machine {
    private boolean startWorking;
    private boolean stopWorking;

    public Truck(boolean startWorking, boolean stopWorking) {
        this.startWorking = startWorking;
        this.stopWorking = stopWorking;
    }

    @Override
    public void doWork() {
        if (startWorking) {
            System.out.println("Truck is started working");
        }
    }

    @Override
    public void stopWork() {
        if (stopWorking) {
            System.out.println("Truck is stopped working");
        }
    }
}
