package module;

import abstracts.Machine;

public class Bulldozer extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped");
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer worked");
    }
}
