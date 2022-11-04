package My_Application;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("My_Application.Truck is working now!");
    }

    @Override
    public void stopWork() {
        System.out.println("My_Application.Truck stops working!");
    }
}
