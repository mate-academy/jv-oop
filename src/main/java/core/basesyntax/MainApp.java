package core.basesyntax;

import core.basesyntax.machinepack.Bulldozer;
import core.basesyntax.machinepack.Excavator;
import core.basesyntax.machinepack.Machine;
import core.basesyntax.machinepack.Truck;

public class MainApp {
    public static void main(String[] args) {


        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }


    }
}
