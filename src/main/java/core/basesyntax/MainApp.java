package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    static Machine[] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
