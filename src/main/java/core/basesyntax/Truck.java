package core.basesyntax;

/**
 * The class describe a powerful machine for transporting goods by road.
 */
public class Truck extends Machine {
    //This is the template for the first part of the message.
    private final String name = "Truck";

    //METHODS
    @Override
    public void doWork() {
        System.out.println(name + messageDoWork);
    }

    @Override
    public void stopWork() {
        System.out.println(name + messageStopWork);
    }
}
