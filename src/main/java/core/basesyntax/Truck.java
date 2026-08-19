package core.basesyntax;

public class Truck extends Machine {
    public Truck(String name) {
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
