package vehicles;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("Truck has started its working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped its working");
    }
}
