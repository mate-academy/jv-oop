package core.basesyntax;

public abstract class Machine {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;
    public Machine() {
    }
    public abstract void doWork();
    public abstract void stopWork();
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public void setBrand(String brandMachine) {
       this.brand = brandMachine;
    }
    public void setModel(String modelMachine) {
        this.model = modelMachine;
    }
    public void setColor(String colorMachine) {
        this.color = colorMachine;
    }
    public void setYearOfManufacture(int yearOfManufactureMachine) {
        this.yearOfManufacture = yearOfManufactureMachine;
    }
}
