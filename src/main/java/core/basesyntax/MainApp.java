package core.basesyntax;

import core.basesyntax.machine.Bulldozer;
import core.basesyntax.machine.Excavator;
import core.basesyntax.machine.Machine;
import core.basesyntax.machine.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
