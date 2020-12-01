package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        Machine[] machines = new Machine[] {bulldozer, excavator, truck};

        for (Machine machine : machines) {
            workAndStop(machine);
        }
    }

    public static void workAndStop(Machine machine) {
        machine.doWork();
        machine.stopWork();
    }
}
