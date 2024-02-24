package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        String message = "Excavator started to work";
        System.out.println(message);
    }

    @Override
    public void stopWork() {
        String message = "Excavator stopped to work";
        System.out.println(message);
    }
}
