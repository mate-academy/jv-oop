package core.basesyntax.samples;

import core.basesyntax.model.Machine;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println(getTypeOfMmachine() + " machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getTypeOfMmachine() + " machine stopped its work");
    }
}
