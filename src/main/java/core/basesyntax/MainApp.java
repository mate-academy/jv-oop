package core.basesyntax;

import core.basesyntax.machine.Machine;
import core.basesyntax.machine.impl.Bulldozer;
import core.basesyntax.machine.impl.Excavator;
import core.basesyntax.machine.impl.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
