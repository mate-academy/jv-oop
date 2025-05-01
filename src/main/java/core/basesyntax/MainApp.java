package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Truck;
import core.basesyntax.service.Machine;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Machine[] machines = new Machine[]{bulldozer, excavator, truck};

        for (Machine machine: machines) {
            machine.doWork();
        }

        for (Machine machine: machines) {
            machine.stopWork();
        }
    }
}
