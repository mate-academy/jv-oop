package core.basesyntax;

import task.Bulldozer;
import task.Excavator;
import task.Machine;
import task.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];

        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }

}
