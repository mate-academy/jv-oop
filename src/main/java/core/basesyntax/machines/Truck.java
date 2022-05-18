package core.basesyntax.machines;

public class Truck extends Machine {

    public Truck(int id) {
        setMachineID(id);
    }

    public void doWork() {
        if (isWorking()) {
            System.out.println("Truck with ID:" + getMachineID() + "\n Is already"
                    + " towing a container");
        }
        System.out.println("Truck with ID:" + getMachineID() + "\n Is now towing"
                + " a container");
        setWorking(true);
    }

    public void stopWork() {
        if (!isWorking()) {
            System.out.println("Truck with ID:" + getMachineID() + "\n The engine"
                    + " is not started");
        }
        System.out.println("Truck with ID:" + getMachineID() + "\n Stopped the engine");
        setWorking(false);
    }
}
