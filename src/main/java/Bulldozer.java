public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldozer has started working - it's pushing dirt.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer has stopped working - it's done pushing dirt.");
    }
}
