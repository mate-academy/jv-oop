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
        System.out.println(brand + "! " + "Let`s deliver some cargo!");
    }

    @Override
    public void stopWork() {
        System.out.println(brand + "! " + "That's enough, time to rest!");
    }
}
