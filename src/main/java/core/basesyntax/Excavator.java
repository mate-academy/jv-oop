package core.basesyntax;

public class Excavator extends Machine {
    private boolean startWorking;
    private boolean stopWorking;

    public Excavator(boolean startWorking, boolean stopWorking) {
        this.stopWorking = stopWorking;
        this.startWorking = startWorking;
    }

    @Override
    public void doWork() {
        if (startWorking) {
            System.out.println("Excavator is started working");
        }
    }

    @Override
    public void stopWork() {
        if (stopWorking) {
            System.out.println("Excavator is stopped working");
        }
    }
}
