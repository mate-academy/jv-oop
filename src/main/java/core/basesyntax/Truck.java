package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        MainApp.print("Truck started working");
    }

    @Override
    public void stopWork() {
        MainApp.print("Truck stopped working");
    }
}
