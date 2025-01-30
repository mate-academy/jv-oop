package core.basesyntax;

public class Bulldozer extends Machine {
    private final String carName = "bulldozer";
    
    public void doWork() {
        System.out.println(carName + " is running...");
    }

    public void stopWork() {
        System.out.println(carName + " is stoped...");
    }
}
