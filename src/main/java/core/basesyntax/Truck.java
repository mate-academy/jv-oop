package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Dump truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Dump truck has stopped working");
    }
}
