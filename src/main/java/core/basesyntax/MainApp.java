package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Machine;
import core.basesyntax.model.Truck;

public class MainApp {
    private static Machine truck = new Truck();
    private static Machine bulldozer = new Bulldozer();
    private static Machine excavator = new Excavator();
    private static Machine[] machines = new Machine[]{truck, bulldozer, excavator};

    public static void main(String[] args) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
