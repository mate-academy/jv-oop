package core.basesyntax;

import core.basesyntax.vehicle.Bulldozer;
import core.basesyntax.vehicle.Excavator;
import core.basesyntax.vehicle.Machine;
import core.basesyntax.vehicle.Truck;

import javax.crypto.Mac;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine:machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
