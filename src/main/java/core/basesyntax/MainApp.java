package core.basesyntax;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Truck truck = new Truck("Truck");
        Bulldozer bulldozer = new Bulldozer("Bulldozer");
        Excavator excavator = new Excavator(" Excavator");


        Machine[] machines = {truck, bulldozer, excavator};
        printTotal(machines);
        System.out.println();
    }

    private static void printTotal(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
        System.out.println(Arrays.toString(machines));
    }
}
