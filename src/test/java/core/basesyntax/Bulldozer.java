package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldozer is now working.");
    }
    @Override
    public void stopWork() {
        System.out.println("The Bulldozer has stopped working and is now idle.");
    }
}
