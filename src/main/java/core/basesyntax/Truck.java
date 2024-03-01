package core.basesyntax;
import core.basesyntax.MainApp.Machine;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck starts working...");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working...");
    }
}
