package vehicles;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator has started its working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped its working");
    }
}
