package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String plateNumber, int age) {
        super(plateNumber, age);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop working");
    }
}


