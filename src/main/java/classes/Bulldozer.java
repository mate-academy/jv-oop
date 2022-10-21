package classes;

public class Bulldozer extends Machine {
    private int operatingWeight;

    public Bulldozer() {
    }

    public Bulldozer(String brand) {
        super(brand);
    }

    public Bulldozer(int motorPower) {
        super(motorPower);
    }

    public Bulldozer(String brand, int motorPower, int operatingWeight) {
        super(brand, motorPower);
        this.operatingWeight = operatingWeight;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println(getBrand() + "! " + "Time to make some work!");
    }

    @Override
    public void stopWork() {
        System.out.println(getBrand() + "! " + "Stop Machine!");
    }
}
