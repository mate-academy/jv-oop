package machines;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starting work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stoping work");
    }
}
