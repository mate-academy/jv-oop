package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String plateNumber, int age) {
        super(plateNumber, age);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop working");
    }
}
