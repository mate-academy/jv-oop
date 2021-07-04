package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Array of different machines
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

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
