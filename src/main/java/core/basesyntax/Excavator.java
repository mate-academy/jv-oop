package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        printMessage(messageDo());
    }

    @Override
    public void stopWork() {
        printMessage(messageStop());
    }
}
