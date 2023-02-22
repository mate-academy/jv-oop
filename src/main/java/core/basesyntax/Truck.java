package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is start working.");
    }
    
    @Override
    public void stopWork() {
        System.out.println("Truck stop working.");
    }
}
