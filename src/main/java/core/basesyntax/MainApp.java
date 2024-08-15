package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{
                new Buldoser(),
                new Excavator(),
                new Truck()
        };
        // Iterate through the array and call doWork() and stopWork()
        for (Machine machine : machines) {
            machine.doWork();
        }

        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
