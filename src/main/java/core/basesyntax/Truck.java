package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck has started to transport freight,"
                + " carry specialized payloads, or perform other utilitarian work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has stopped to transport freight,"
                + " carry specialized payloads and perform other utilitarian work.");
    }
}
