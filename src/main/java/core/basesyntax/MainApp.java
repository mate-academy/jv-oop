package core.basesyntax;

import core.baseclasses.Bulldozer;
import core.baseclasses.Excavator;
import core.baseclasses.Machine;
import core.baseclasses.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};   
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
