package core.basesyntax;

public class Bulldozer extends Machine {
    private boolean stopWorking;
    private boolean startWorking;

    public Bulldozer(boolean startWorking, boolean stopWorking) {
        this.startWorking = startWorking;
        this.stopWorking = stopWorking;
    }

    public void stopWork() {
        if (stopWorking) {
            System.out.println("Bulldozer is stopped working");
        }
    }

    public void doWork() {
        if (startWorking) {
            System.out.println("Bulldozer is started working");
        }

    }
}

