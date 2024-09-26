package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("BRRRRR");
    }
    @Override
    public void stopWork() {
        System.out.println("TRRRRR");
    }
}
