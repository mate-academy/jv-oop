package My_Application;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("My_Application.Bulldozer is working now!");
    }

    @Override
    public void stopWork() {
        System.out.println("My_Application.Bulldozer stops working!");
    }
}
