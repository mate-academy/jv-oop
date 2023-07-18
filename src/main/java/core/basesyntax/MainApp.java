package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Truck;
import core.basesyntax.service.Machine;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
