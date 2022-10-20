package classes;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    public Bulldozer(String brand, int motorPower, int operatingWeight) {
        super(brand, motorPower);
        this.operatingWeight = operatingWeight;
    }

    public Bulldozer(String brand) {
        super(brand);
    }

    public Bulldozer(int motorPower) {
        super(motorPower);
    }

    private int operatingWeight;
    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println(brand + "! " + "Time to make some work!");
    }

    @Override
    public void stopWork() {
        System.out.println(brand + "! " + "Stop Machine!");
    }
}
