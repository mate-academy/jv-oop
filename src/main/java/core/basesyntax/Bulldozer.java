package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is working: started leveling the ground.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped: finished leveling the ground.");
    }
}
