public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is work! :)");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer is down! :(");
    }
}
