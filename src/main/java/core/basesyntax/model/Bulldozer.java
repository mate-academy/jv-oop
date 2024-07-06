package core.basesyntax.model;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Common Bulldozer, You can do it");
    }

    @Override
    public void stopWork() {
        System.out.println("Ohh Bulldozer, try again");
    }
}
