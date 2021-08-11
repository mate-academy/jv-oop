package core.basesyntax;

public class Truck extends Machine {
    private int capacity;

    public Truck(String model, int id, int capacity) {
        super(model, id);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void doWork(){
        System.out.println(getModel() + " " + "Capacity: " + capacity + " " + "start to work!");
    }
    public void stopWork(){
        System.out.println(getModel() + " " + "Capacity: " + capacity + " " + "stop working!");
    }
}
