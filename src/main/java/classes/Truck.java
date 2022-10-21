package classes;

public class Truck extends Machine {
    private double loadCapacity;

    public Truck(String brand, int motorPower, double loadCapacity) {
        super(brand, motorPower);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand) {
        super(brand);
    }

    public Truck() {
    }

    public Truck(int motorPower) {
        super(motorPower);
    }

    @Override
    public void doWork() {
        System.out.println(getBrand() + "! " + "Let`s deliver some cargo!");
    }

    @Override
    public void stopWork() {
        System.out.println(getBrand() + "! " + "That's enough, time to rest!");
    }
}
