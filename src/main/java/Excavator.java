public class Excavator extends Machine {
    @Override

    public void doWork() {
        System.out.println("It works");
    }

    @Override

    public void stopWork() {
        System.out.println("It is stopped");
    }
}
