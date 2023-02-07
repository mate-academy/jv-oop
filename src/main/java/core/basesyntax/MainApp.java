package core.basesyntax;

import core.basesyntax.classes.Bulldozer;
import core.basesyntax.classes.Excavator;
import core.basesyntax.classes.Machine;
import core.basesyntax.classes.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
