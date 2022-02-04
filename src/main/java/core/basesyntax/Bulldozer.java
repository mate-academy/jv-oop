package core.basesyntax;

public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer() {
    }

    public Bulldozer(String brand, String model, String bladeType) {
        super(brand, model);
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("The bulldozer " + getBrand() + " " + getModel()
                + " began to replace the blade with " + getBladeType() + ".");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer " + getBrand() + " " + getModel()
                + " has finished replacing the blade.");
    }

    public String getBladeType() {
        return bladeType;
    }
}
