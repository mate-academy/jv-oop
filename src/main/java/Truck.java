public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("truck is working");
    }

    @Override
    public void stopWork() {
        System.out.println("truck stopped working");
    }
}
