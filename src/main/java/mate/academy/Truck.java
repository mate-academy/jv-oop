package mate.academy;

public class Truck extends Machine {

    @Override
    public String doWork() {
        System.out.println("Truck starts working!");
        return null;
    }

    @Override
    public String stopWork() {
        System.out.println("Truck stops working!");
        return null;
    }
}
