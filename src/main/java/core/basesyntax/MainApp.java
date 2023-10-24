package core.basesyntax;

import core.basesyntax.classes.Bulldozer;
import core.basesyntax.classes.Excavator;
import core.basesyntax.classes.Machine;
import core.basesyntax.classes.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine track = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] team = new Machine[]{track, bulldozer, excavator};
        for (Machine machine: team) {
            machine.doWork();
        }
        for (Machine machine: team) {
            machine.stopWork();
        }
    }
}
