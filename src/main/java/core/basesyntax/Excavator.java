package core.basesyntax;

/**
 * Class describe the self-propelled earth-moving machine for extraction
 * and transfer soil, stone etc.
 */
public class Excavator extends Machine {
    //This is the template for the first part of the message.
    private final String name = "Excavator";

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
