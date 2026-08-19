package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String name) {
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
