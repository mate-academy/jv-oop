package main.java.core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Machine[] machines = new Machine[3];
        machines[0] = excavator;
        machines[1] = bulldozer;
        machines[2] = truck;

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
