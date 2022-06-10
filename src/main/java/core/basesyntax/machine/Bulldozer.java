package core.basesyntax.machine;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer machine stopped its work");
    }
}
