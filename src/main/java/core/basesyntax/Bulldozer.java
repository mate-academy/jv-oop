package core.basesyntax;

public class Bulldozer extends MainApp.Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts working...");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working...");
    }
}
