package core.basesyntax;

import Machines.Bulldozer;
import Machines.Excavator;
import Machines.Machine;
import Machines.Truck;

public class MainApp {

    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] machine = {truck, bulldozer, excavator};
        for (int i = 0; i < machine.length; i++){
            machine[i].doWork();
            machine[i].stopWork();
        }
    }

}
