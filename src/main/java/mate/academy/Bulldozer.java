package mate.academy;

public class Bulldozer extends Machine {

    @Override
    public String doWork() {
        System.out.println("Bulldozer starts working!");
        return null;
    }

    @Override
    public String stopWork() {
        System.out.println("Bulldozer stops working!");
        return null;
    }
}
