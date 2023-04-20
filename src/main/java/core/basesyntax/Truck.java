package JavaCoreOOPBasic;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starts its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stops its work");
    }
}
