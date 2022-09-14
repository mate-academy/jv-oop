package core.basesyntax;

import core.basesyntax.machine.Machine;
import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        truck.setSerialNumber("T1");
        Machine bulldozer = new Bulldozer();
        bulldozer.setSerialNumber("B1");
        Machine excavator = new Excavator();
        excavator.setSerialNumber("E1");
        Machine[] machines = new Machine[] {truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
