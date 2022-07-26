package core.basesyntax;

/**
 * Class describe the self-propelled earth-moving machine for extraction and transfer soil, stone etc.
 */
public class Excavator extends Machine{
    //This is the template for the first part of the message.
    private final static String NAME = "Excavator";

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
