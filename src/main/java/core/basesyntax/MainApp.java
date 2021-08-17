package core.basesyntax;

import core.basesyntax.machine.Machine;
import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck1 = new Truck();
        truck1.setSerialNumber("T1");

        Machine bulldozer1 = new Bulldozer();
        bulldozer1.setSerialNumber("B1");

        Machine excavator1 = new Excavator();
        excavator1.setSerialNumber("E1");

        Machine[] machines = new Machine[] {truck1, bulldozer1, excavator1};

        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
