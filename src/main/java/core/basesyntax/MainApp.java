package core.basesyntax;

import mate.academy.Bulldozer;
import mate.academy.Excavator;
import mate.academy.Machine;
import mate.academy.Truck;

public class MainApp {
    public static void main(String[] args) {

        Machine[] Machine = {new Truck(), new Bulldozer(), new Excavator()};

        // Calling doWork() and stopWork() methods in a loop
        for (Machine machine : Machine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
