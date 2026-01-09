package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        truck.setName("truck");

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("bulldozer");

        Machine excavator = new Excavator();
        excavator.setName("excavator");

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
