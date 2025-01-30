package core.basesyntax;

public class Truck extends Machine {
    private final String carName = "Truck";
    
    public void doWork() {
        System.out.println(carName + " is running...");
    }

    public void stopWork() {
        System.out.println(carName + " is stopped...");
    }
}
