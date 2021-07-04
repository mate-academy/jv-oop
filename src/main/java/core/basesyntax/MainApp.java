package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Create different machines
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        // Create and fill the machines array
        Machine[] machines = new Machine[3];
        machines[0] = truck;
        machines[1] = bulldozer;
        machines[2] = excavator;

        // Start work of all machines
        for (Machine machine : machines) {
            machine.doWork();
        }

        // Stop work of all machines
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
