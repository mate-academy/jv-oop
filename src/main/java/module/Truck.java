package module;

import abstracts.Machine;

public class Truck extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Truck stopped");
    }

    @Override
    public void doWork() {
        System.out.println("Truck worked");
    }
}
