package core.basesyntax;

import core.basesyntax.model.Machine;
import core.basesyntax.samples.Bulldozer;
import core.basesyntax.samples.Excavator;
import core.basesyntax.samples.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.setTypeOfMmachine("Truck");
        bulldozer.setTypeOfMmachine("Bulldozer");
        excavator.setTypeOfMmachine("Excavator");

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
