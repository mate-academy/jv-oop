package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machines = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine: machines) {
            doWorkAll(machine);
        }
        for (Machine machine: machines) {
            stopWorkAll(machine);
        }
    }
    public static void doWorkAll(Machine machine) {
        machine.doWork();
    }

    public static void stopWorkAll(Machine machine) {
        machine.stopWork();
    }
}
