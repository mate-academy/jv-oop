package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Machine;
import core.basesyntax.model.Truck;

public class MainApp {
    public static void main(String[] args) {

        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();

        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}

