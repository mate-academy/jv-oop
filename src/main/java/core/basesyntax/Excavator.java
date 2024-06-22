package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getMachineType() + " machine has started working");
    }

    @Override
    public void stopWork() {
        System.out.println(getMachineType() + " machine has stopped working.");
    }

    @Override
    public String getMachineType() {
        return "Excavator";
    }
}

