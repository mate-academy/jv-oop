package core.basesyntax;

import zd.machinery.Bulldozer;
import zd.machinery.Excavator;
import zd.machinery.Machine;
import zd.machinery.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
