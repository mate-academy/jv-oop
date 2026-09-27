package core.basesyntax;

import model.Bulldozer;
import model.Excavator;
import model.Machine;
import model.Truck;

public class MainApp {

    public static void main(String[] args) {

        Machine[] machines = new Machine[] { new Bulldozer(), new Excavator(), new Truck() };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
