package core.basesyntax.samples;

import core.basesyntax.model.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work");
    }
}
