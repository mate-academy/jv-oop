package core.basesyntax.machine;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("This excavator has started its work!");
    }

    public void stopWork() {
        System.out.println("This excavator has stopped working!");
    }
}
