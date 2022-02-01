package core.basesyntax;

public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer() {
    }

    public Bulldozer(String bladeType) {
        this.bladeType = bladeType;
    }

    public Bulldozer(String brandMachine, String modelMachine, String bladeType) {
        super(brandMachine, modelMachine);
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

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }
}
