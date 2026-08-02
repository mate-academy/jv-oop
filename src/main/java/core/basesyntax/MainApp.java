package core.basesyntax;

import java.lang.reflect.Array;

public class MainApp {

    public static void main(String[] args) {
        Machine[] machineArray = { new Truck(), new Bulldozer(), new Excavator() };

        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
