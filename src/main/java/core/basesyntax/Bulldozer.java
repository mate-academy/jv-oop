package core.basesyntax;

public class Bulldozer extends Machine {
    private int tonnage;

    public Bulldozer(String model, int id, int tonnage) {
        super(model, id);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;

    }

    public void doWork() {
        System.out.println(getModel() + " " + "Tonnage: " + tonnage + " " + "start to work!");
    }

    public void stopWork() {
        System.out.println(getModel() + " " + "Tonnage: " + tonnage + " " + "stop working!");
    }
}
