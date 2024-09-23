package core.basesyntax;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck("Mikki");
        Machine bulldozer = new Bulldozer("Eduardo");
        Machine excavator = new Excavator("Maks");

        Machine[] machines = {truck, bulldozer, excavator};
        printTotal(machines);
    }

    private static void printTotal(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
        System.out.println(Arrays.toString(machines));
    }
}
