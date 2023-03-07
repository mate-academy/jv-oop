package core.basesyntax.machines;

import core.basesyntax.workflow.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer starts work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer finished work");
    }
}
