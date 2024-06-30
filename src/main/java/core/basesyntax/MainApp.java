package core.basesyntax;

import core.basesyntax.machine.Machine;
import core.basesyntax.machine.impl.Bulldozer;
import core.basesyntax.machine.impl.Excavator;
import core.basesyntax.machine.impl.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
