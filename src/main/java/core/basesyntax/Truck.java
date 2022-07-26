package core.basesyntax;

/**
 * The class describe a powerful machine for transporting goods by road.
 */
public class Truck extends Machine{
    //This is the template for the first part of the message.
    private final static String NAME = "Truck";

    //METHODS
    @Override
    public void doWork() {
        System.out.println(NAME + MESSAGE_DO_WORK);
    }

    @Override
    public void stopWork() {
        System.out.println(NAME + MESSAGE_STOP_WORK);
    }
}
