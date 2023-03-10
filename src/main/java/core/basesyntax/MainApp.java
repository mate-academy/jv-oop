package core.basesyntax;

/**
 * The class defines the operation of different kinds of machines.
 * The main() method calls one method.
 */
public class MainApp {
    /**
     * Shows information about the operation of all machines.
     *
     * @param args args array contains 0 elements.
     */
    public static void main(String[] args) {
        showMachinesWork();
    }

    /**
     * Displays information about the operation of three types of machines to the console.
     */
    private static void showMachinesWork() {
        // Creates an instance of the corresponding class.
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        // Creates an array from 3 machines.
        Machine[] machines = new Machine[3];
        machines[0] = excavator;
        machines[1] = bulldozer;
        machines[2] = truck;

        // The loop iterates through all the elements of the array and calls their methods.
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
