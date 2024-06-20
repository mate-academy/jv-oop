package core.basesyntax;

import core.basesyntax.garage.Bulldozer;
import core.basesyntax.garage.Excavator;
import core.basesyntax.garage.Machine;
import core.basesyntax.garage.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[]{truck, bulldozer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
