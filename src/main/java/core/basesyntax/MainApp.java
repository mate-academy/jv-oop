package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        machineStatus(machines);
    }

    public static void machineStatus(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
