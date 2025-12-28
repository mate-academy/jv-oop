package fch;

import fch.models.Truck;
import fch.models.Excavator;
import fch.models.Bulldozer;
import fch.models.Machine;

public class MainApp {

    public static void main(String[] args) {

        Machine truck = new Truck();

        Machine bulldozer = new Bulldozer();

        Machine excavator = new Excavator();

        Machine[] machines = new Machine[]{ truck, bulldozer, excavator};

        for (Machine machine : machines) {

            machine.doWork();

            machine.stopWork();

        }

    }

}
