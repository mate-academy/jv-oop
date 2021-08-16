package vehicles;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer has started its working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped its working");
    }
}
