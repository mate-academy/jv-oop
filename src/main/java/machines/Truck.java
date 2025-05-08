package machines;

public class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck has started the job");
    }

    public void stopWork() {
        System.out.println("Truck has stopped the job");
    }
}
