package task1;

public class Excavator extends Machine{

    @Override
    public void doWork() {
        System.out.println("Excavator is started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is stopped its work.");
    }
}
