package core.basesyntax;

import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Truck;

public class Main {
    public static void main(String[] args) {
        Machine truck1 = new Truck();
        truck1.doWork();
        truck1.endWork();
        Machine bulldozer1 = new Bulldozer();
        bulldozer1.doWork();
        bulldozer1.endWork();
        Machine excavator1 = new Excavator();
        excavator1.doWork();
        excavator1.endWork();
    }
}
