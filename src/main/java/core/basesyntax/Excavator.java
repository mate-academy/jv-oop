package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer started it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer has stopped it's work");
    }
}
