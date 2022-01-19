package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();
        excavator.stopWork();
        bulldozer.stopWork();
        truck.stopWork();
    }

}
