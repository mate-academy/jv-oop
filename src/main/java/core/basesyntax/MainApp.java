package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Create an array of Machine and populate it with specific implementations
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        // Iterate through the array and call the methods for each machine
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
