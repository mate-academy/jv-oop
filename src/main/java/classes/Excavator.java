package classes;

public class Excavator extends Machine {
    private double bucketVolume;

    public Excavator() {
    }

    public Excavator(String brand) {
        super(brand);
    }

    public Excavator(int motorPower) {
        super(motorPower);
    }

    public Excavator(String brand, int motorPower, double bucketVolume) {
        super(brand, motorPower);
        this.bucketVolume = bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println(getBrand() + "! " + "Start digging!");
    }

    @Override
    public void stopWork() {
        System.out.println(getBrand() + "! " + "Job is done!");
    }
}
