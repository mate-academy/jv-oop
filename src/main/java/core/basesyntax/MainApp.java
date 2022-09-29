package core.basesyntax;

import core.basesyntax.Machines.Bulldozer;
import core.basesyntax.Machines.Excavator;
import core.basesyntax.Machines.Machine;
import core.basesyntax.Machines.Truck;

import java.lang.reflect.Array;

public class MainApp {
    public static void main(String[] args) {

        Machine[] machinesList = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machinesList) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
