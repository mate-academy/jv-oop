package core.basesyntax.vehicle;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator grab dirt");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator grabbed all dirt");
    }
}
