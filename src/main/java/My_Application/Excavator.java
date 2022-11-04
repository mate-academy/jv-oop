package My_Application;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("My_Application.Excavator is working now!");
    }

    @Override
    public void stopWork() {
        System.out.println("My_Application.Excavator stops working!");
    }
}
