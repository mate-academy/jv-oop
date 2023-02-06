package core.basesyntax;

import core.baseclasses.Bulldozer;
import core.baseclasses.Excavator;
import core.baseclasses.Machine;
import core.baseclasses.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machs = {new Truck(), new Bulldozer(), new Excavator()};
        
        for (Machine m: machs) {
            m.doWork();
            m.stopWork();
        }
    }
}
