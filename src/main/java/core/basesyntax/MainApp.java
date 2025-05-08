package core.basesyntax;

public class MainApp {

    private Bulldozer bulldozer = new Bulldozer();
    private Excavator excavator = new Excavator();
    private Truck truck = new Truck();

    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

        workMachine(machines);
    }

    public static void workMachine(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }

    }
}

