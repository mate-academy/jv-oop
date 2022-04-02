package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};

        for (Machine machine : machines) {
            machine.doWork();
        }

        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
