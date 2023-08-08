package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = generateMachines();
        working(machines);
    }

    private static Machine[] generateMachines() {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Excavator();
        machines[2] = new Bulldozer();
        return machines;
    }

    private static void working(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
