package machines;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starting work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stoping work");
    }
}
