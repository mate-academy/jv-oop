package core.basesyntax.machines;

public class Excavator extends Machine {
    public Excavator(int id) {
        setMachineID(id);
    }

    public void doWork() {
        if (isWorking()) {
            System.out.println("Excavator with ID:" + getMachineID() + "\n Is already"
                     + " digging something");
        }
        System.out.println("Excavator with ID:" + getMachineID() + "\n Is now digging");
        setWorking(true);
    }

    public void stopWork() {
        if (!isWorking()) {
            System.out.println("Excavator with ID:" + getMachineID() + "\n The engine"
                    + " is not started");
        }
        System.out.println("Excavator with ID:" + getMachineID() + "\n Stopped the engine");
        setWorking(false);
    }
}
