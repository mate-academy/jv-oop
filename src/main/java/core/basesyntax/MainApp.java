package core.basesyntax;

import core.basesyntax.vehicle.Bulldozer;
import core.basesyntax.vehicle.Excavator;
import core.basesyntax.vehicle.Machine;
import core.basesyntax.vehicle.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
            System.out.println();
        }
    }
}
