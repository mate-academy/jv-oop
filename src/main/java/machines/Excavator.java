package machines;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator has started the job");
    }

    public void stopWork() {
        System.out.println("Excavator has stopped the job");
    }
}
