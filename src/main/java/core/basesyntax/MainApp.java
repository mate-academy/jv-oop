package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        Machine[] arrMachines = new Machine[3];

        {new Bulldozer(),new Excavator(),new Truck()};

        for (Machine machine : arrMachines) {
            machine.doWork();
            machine.stopWork();
        }

        System.out.println(Arrays.toString(arrMachines));

    }

}
