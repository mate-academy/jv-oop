package task1;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is stopped its work.");
    }
}
