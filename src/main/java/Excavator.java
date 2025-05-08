public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("excavator is working");
    }

    @Override
    public void stopWork() {
        System.out.println("excavator stopped working");
    }
}
