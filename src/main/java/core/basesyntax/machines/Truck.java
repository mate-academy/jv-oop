package core.basesyntax.machines;

public class Truck extends Machine {

    public Truck(int id) {
        super(id);
    }

    public void doWork() {
        if (isWorking()) {
            System.out.println("Truck with ID:" + getMachineId() + "\n Is already"
                    + " towing a container");
            return;
        }
        System.out.println("Truck with ID:" + getMachineId() + "\n Is now towing"
                + " a container");
        setWorking(true);
    }

    public void stopWork() {
        if (!isWorking()) {
            System.out.println("Truck with ID:" + getMachineId() + "\n The engine"
                    + " is not started");
            return;
        }
        System.out.println("Truck with ID:" + getMachineId() + "\n Stopped the engine");
        setWorking(false);
    }
}
