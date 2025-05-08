package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Truck;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine[] machines = {truck,bulldozer,excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
