package classes;

public abstract class Machine {
    private String brand;
    private int motorPower;

    public Machine() { // constructor 1
    }

    public Machine(String brand) { // constructor 2
        this.brand = brand;
    }

    public Machine(int motorPower) { // constructor 3
        this.motorPower = motorPower;
    }

    public Machine(String brand, int motorPower) { // constructor 4
        this.motorPower = motorPower;
        this.brand = brand;
    }

    public abstract void doWork();

    public abstract void stopWork();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }
}
