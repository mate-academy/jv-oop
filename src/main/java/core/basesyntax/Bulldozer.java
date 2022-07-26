package core.basesyntax;

/**
 * Class describe the tractor equipped with a hinged dump.
 */
public class Bulldozer extends Machine{
    //This is the template for the first part of the message.
    private final static String NAME = "Bulldozer";

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
