package working.technique;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped working");
    }
}
