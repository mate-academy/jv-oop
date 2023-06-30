package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = {truck,bulldozer,excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
