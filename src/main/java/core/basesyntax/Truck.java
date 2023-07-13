package core.basesyntax;

public class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck starts doing work!");
    }

    public void stopWork() {
        System.out.println("Truck stopped doing work :(");
    }
}
