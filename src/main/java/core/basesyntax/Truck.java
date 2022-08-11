package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork(){
        System.out.println("Truck starts transportation");
    }

    @Override
    public void stopWork(){System.out.println("Truck stops transportation");
    }
}
