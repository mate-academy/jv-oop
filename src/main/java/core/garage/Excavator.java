package core.garage;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The Excavator started working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator stopped working!");
    }
}
