package core.basesyntax;

public class Excavator extends Machine {
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public Excavator(String brandMachine, String modelMachine, int bucketVolume) {
        super(brandMachine, modelMachine);
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("An excavator " + getBrand() + " " + getModel()
                + " with a bucket of " + getBucketVolume()
                + " cubic meters started digging a pit.");
    }

    @Override
    public void stopWork() {
        System.out.println("An excavator " + getBrand() + " " + getModel()
                + " finished digging the pit.");
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
}
