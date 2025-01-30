package core.basesyntax;

public class Exavator extends Machine {
    private final String carName = "Exavator";

    public void doWork() {
        System.out.println(carName + " is running...");
    }

    public void stopWork() {
        System.out.println(carName + " is stoped...");
    }
}
