package core.basesyntax.machines;

import core.basesyntax.model.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " start working");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " stop working");
    }
}
