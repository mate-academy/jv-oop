package core.machines;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("The bulldozer starts working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer is finished working!");
    }
}
