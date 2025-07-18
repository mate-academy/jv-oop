package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        MainApp.print("Excavator started working");
    }

    @Override
    public void stopWork() {
        MainApp.print("Excavator stopped working");
    }
}