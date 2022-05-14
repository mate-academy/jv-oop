public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("bulldozer is working");
    }

    @Override
    public void stopWork() {
        System.out.println("bulldozer stopped working");
    }
}
