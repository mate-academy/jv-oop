package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Machine;
import core.basesyntax.model.Truck;

public class MainApp {
    private Machine truck = new Truck();
    private Machine bulldozer = new Bulldozer();
    private Machine excavator = new Excavator();
    private Machine[] machines = new Machine[] {truck, bulldozer, excavator};

    public static void runMachines(Machine[] machines) {
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
