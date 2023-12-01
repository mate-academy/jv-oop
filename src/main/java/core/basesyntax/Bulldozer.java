package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is working right now . . .");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working ! ! !");
    }
}

