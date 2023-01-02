package core.basesyntax;

public class Excavator extends Machine {
    private String excavatorName = "Excavator";

    @Override
    public void doWork() {
        System.out.println(excavatorName + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(excavatorName + " finished its work");
    }
}
