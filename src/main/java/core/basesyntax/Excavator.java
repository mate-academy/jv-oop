package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Starts excavating smth");
    }

    @Override
    public void stopWork() {
        System.out.println("No excavating nothing");
    }
}
