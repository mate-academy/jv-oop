package core.basesyntax;

import java.util.Arrays;

public abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();

    Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

    for (Machine machine : machines) {
        machine.doWork();
        machine.stopWork();
    }
}
