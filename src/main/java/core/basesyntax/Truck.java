package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Start cargo transportation to destination");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop and unload cargo");
    }
}
