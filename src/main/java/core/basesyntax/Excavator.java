package core.basesyntax;

public class Excavator extends Machine {
    private int bucketVolume;

    public Excavator(String model, int id, int bucketVolume) {
        super(model, id);

        this.bucketVolume = bucketVolume;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public void doWork() {
        System.out.println(getModel() + " " + "Bucket: " + bucketVolume + " " + "start to work!");
    }

    public void stopWork() {
        System.out.println(getModel() + " " + "Bucket: " + bucketVolume + " " + "stop working!");
    }
}
