package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {

    }

    @Override
    public void stopWork() {
        System.out.println("Volvo: " + getNegativeStatus());
    }
}
