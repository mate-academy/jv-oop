package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        MainApp.print("Bulldozer started working");
    }

    @Override
    public void stopWork() {
        MainApp.print("Bulldozer stopped working");
    }
}
