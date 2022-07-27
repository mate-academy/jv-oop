package core.basesyntax;

public class Excavator extends Machine{

    @Override
    public void doWork() {
        System.out.println("Machine starts work hard!");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine stops working!");
    }
}
