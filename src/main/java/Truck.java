public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println(getClass().getName() + " started work");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getName() + " stopped work");
    }
}
