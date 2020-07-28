package core.basesyntax;

public abstract class Machine {
    String plateNumber;
    int age;

    public Machine(String plateNumber, int age) {
        this.plateNumber = plateNumber;
        this.age = age;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
