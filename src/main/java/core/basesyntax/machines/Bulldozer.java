package core.basesyntax.machines;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer engine starts work! Dr-dr-dr-dr-dr!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer engine stops work!");
    }
}
