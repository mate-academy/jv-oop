package core.basesyntax;

public class Truck extends Machine {
    private int wheels;

    Truck(String model, String fuel, double engineCapacity, int wheels) {
        super(model, fuel, engineCapacity);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if (wheels <= 0) {
            System.out.println("A truck needs wheels to move.");
        }
        this.wheels = wheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck is started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck is stopped its work");
    }
}
