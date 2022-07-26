package core.basesyntax;

/**
 * Class describe the tractor equipped with a hinged dump.
 */
public class Bulldozer extends Machine {
    //This is the template for the first part of the message.
    private final String name = "Bulldozer";

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
