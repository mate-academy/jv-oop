package mate.academy;

public class Excavator extends Machine {
    @Override
    public String stopWork() {
        System.out.println("Excavator stops working!");
        return null;
    }

    @Override
    public String doWork() {
        System.out.println("Excavator starts working!");
        return null;
    }
}
