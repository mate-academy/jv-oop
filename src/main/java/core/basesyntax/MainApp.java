package core.basesyntax;

import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Machine;
import core.basesyntax.models.Truck;

public class MainApp {
    private static Machine excavator = new Excavator();
    private static Machine bulldozer = new Bulldozer();
    private static Machine truck = new Truck();

    public static void main(String[] args) {
        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();

        excavator.stopWork();
        bulldozer.stopWork();
        truck.stopWork();
    }
}
