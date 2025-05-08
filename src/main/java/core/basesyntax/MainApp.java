package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[] {new Excavator(), new Truck(), new Bulldozer()};
        for (Machine machine : machines) {
            printInfo(machine);
        }
    }

    public static void printInfo(Machine machine) {
        machine.doWork();
        machine.stopWork();
    }
}
