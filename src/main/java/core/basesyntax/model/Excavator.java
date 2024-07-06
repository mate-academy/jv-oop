package core.basesyntax.model;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Common Excavator, You can do it");
    }

    @Override
    public void stopWork() {
        System.out.println("Ohh, Excavator  try again");
    }
}
