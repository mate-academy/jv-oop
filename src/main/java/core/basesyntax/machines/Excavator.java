package core.basesyntax.machines;

public class Excavator extends Machine {
    public Excavator(int id) {
        super(id);
    }

    public void doWork() {
        if (isWorking()) {
            System.out.println("Excavator with ID:" + getMachineId() + "\n Is already"
                     + " digging something");
            return;
        }
        System.out.println("Excavator with ID:" + getMachineId() + "\n Is now digging");
        setWorking(true);
    }

    public void stopWork() {
        if (!isWorking()) {
            System.out.println("Excavator with ID:" + getMachineId() + "\n The engine"
                    + " is not started");
            return;
        }
        System.out.println("Excavator with ID:" + getMachineId() + "\n Stopped the engine");
        setWorking(false);
    }
}
