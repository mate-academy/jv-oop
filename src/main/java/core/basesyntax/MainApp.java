package core.basesyntax;

import core.basesyntax.vehicle.Bulldozer;
import core.basesyntax.vehicle.Excavator;
import core.basesyntax.vehicle.Machine;
import core.basesyntax.vehicle.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machines = new Machine[] {truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

