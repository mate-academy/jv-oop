package core.basesyntax.machines;

public class Bulldozer extends Machine {
    public Bulldozer(int id) {
        super(id);
    }

    public void doWork() {
        if (isWorking()) {
            System.out.println("Bulldozer with ID:" + getMachineId() + "\n Is already "
                    + "flattening the ground");
            return;
        }
        System.out.println("Bulldozer with ID:" + getMachineId() + "\n Is now flattening"
                + " the ground");
        setWorking(true);
    }

    public void stopWork() {
        if (!isWorking()) {
            System.out.println("Bulldozer with ID:" + getMachineId() + "\n The engine"
                    + " is not started");
            return;
        }
        System.out.println("Bulldozer with ID:" + getMachineId() + "\n Stopped the engine");
        setWorking(false);
    }
}
