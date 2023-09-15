package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Kopu-Kop");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator stopped working");
    }
}
