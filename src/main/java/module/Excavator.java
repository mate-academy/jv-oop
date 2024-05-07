package module;

import abstracts.Machine;

public class Excavator extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Excavator stopped");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator worked");
    }
}
