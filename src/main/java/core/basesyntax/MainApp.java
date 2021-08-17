package core.basesyntax;

import core.basesyntax.machine.Machine;
import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine firstTruck = new Truck();
        firstTruck.setSerialNumber("T1");
        Machine firstBulldozer = new Bulldozer();
        firstBulldozer.setSerialNumber("B1");
        Machine firstExcavator = new Excavator();
        firstExcavator.setSerialNumber("E1");
        Machine[] machines = new Machine[] {firstTruck, firstBulldozer, firstExcavator};

        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
