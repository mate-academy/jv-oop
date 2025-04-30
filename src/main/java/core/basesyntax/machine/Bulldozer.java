package core.basesyntax.machine;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("This bulldozer has started its work!");
    }

    public void stopWork() {
        System.out.println("This bulldozer has stopped working!");
    }
}
