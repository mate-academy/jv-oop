package mate.academy;

public class Excavator extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Excavator stops working!");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator starts working!");
    }
}
