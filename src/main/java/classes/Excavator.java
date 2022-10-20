package classes;

public class Excavator extends Machine{
    public Excavator() {
    }

    public Excavator(String brand) {
        super(brand);
    }

    public Excavator(int motorPower) {
        super(motorPower);
    }

    public double getBucketVolume() {
        return bucketVolume;
    }
    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
    private double bucketVolume;
    public Excavator(String brand, int motorPower, double bucketVolume) {
        super(brand, motorPower);
        this.bucketVolume = bucketVolume;
    }
    @Override
    public void doWork() {
        System.out.println(brand + "! " + "Start digging!");
    }
    @Override
    public void stopWork() {
        System.out.println(brand + "! " + "Job is done!");
    }
}
