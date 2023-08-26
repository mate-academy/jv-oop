package core.basesyntax;

import core.basesyntax.machines.*;


public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = { new Bulldozer(), new Excavator(), new Truck() };
        for (Machine currentMachine : machines) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }
}
