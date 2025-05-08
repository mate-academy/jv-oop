public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Truck has started working - it's hauling materials.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck has stopped working - it's done hauling.");
    }
}
