package core.basesyntax;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is not working!");
    }
}
