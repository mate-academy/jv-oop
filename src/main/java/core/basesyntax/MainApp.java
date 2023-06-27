package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[]{ new Truck(),new Bulldozer(),new Excavator()};
        for (Machine machine: machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
