package core.basesyntax;

import core.basesyntax.machine.Bulldozer;
import core.basesyntax.machine.Excavator;
import core.basesyntax.machine.Machine;
import core.basesyntax.machine.Truck;

public class MainApp {
    private final Machine[] machines = new Machine[3];

    public MainApp() {
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();

        for (Machine machine : mainApp.machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
