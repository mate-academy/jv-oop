package core.basesyntax;

public class Excavator extends Machine {
    private int maxWeight;

    public Excavator(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void doWork() {
        System.out.println("Excavator start to work");
    }

    public void endWork() {
        System.out.println("Excavator finished work");
    }
}
