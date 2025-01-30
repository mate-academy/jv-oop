package core.basesyntax;

public class Excavator extends Machine {
    private final String carName = "Excavator";

    public void doWork() {
        System.out.println(carName + " is running...");
    }

    public void stopWork() {
        System.out.println(carName + " is stopped...");
    }
}
