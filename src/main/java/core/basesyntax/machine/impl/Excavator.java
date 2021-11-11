package core.basesyntax.machine.impl;
import core.basesyntax.machine.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped its work");
    }
}
