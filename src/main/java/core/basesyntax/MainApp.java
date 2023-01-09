package core.basesyntax;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
       Truck truck = new Truck();
       Bulldozer bulldozer = new Bulldozer();
       Excavator excavator = new Excavator();
       Machine[] machines = new Machine[]{truck,bulldozer,excavator};

        for (Machine mach : machines ) {
            mach.doWork();
            mach.stopWork();
        }
    }
}
