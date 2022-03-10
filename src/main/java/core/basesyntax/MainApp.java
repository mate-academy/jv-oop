package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Truck;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();

        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}
