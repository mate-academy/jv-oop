package core.basesyntax;

public class Track extends Machine {
    public Track(String plateNumber, int age) {
        super(plateNumber, age);
    }

    @Override
    public void doWork() {
        System.out.println("Track start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stop working");
    }
}
