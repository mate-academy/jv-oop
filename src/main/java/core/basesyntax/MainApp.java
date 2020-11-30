package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        Machine[] machinesWork = new Machine[] {bulldozer, excavator, truck};
        Machine[] machinesStop = new Machine[] {bulldozer, excavator, truck};

        for (Machine machine : machinesWork) {
            work(machine);
        }

        System.out.println();

        for (Machine machine : machinesStop) {
            stop(machine);
        }
    }

    public static void work(Machine machine) {
        machine.doWork();
    }

    public static void stop(Machine machine) {
        machine.stopWork();
    }
}
