package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();

        Machine bulldozer = new Bulldozer();

        Machine excavator = new Excavator();

        Machine [] machines = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine : machines) {
            printInfo(machine);
        }
    }

    public static void printInfo(Machine machine) {
        machine.doWork();
        machine.stopWork();
    }
}
