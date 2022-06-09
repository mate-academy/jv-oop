package core.basesyntax;

import core.basesyntax.machine.Bulldozer;
import core.basesyntax.machine.Excavator;
import core.basesyntax.machine.Truck;

public class MainApp {

    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Excavator();
        machines[1] = new Bulldozer();
        machines[2] = new Truck();
        for (int i = 0; i <= machines.length - 1; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
