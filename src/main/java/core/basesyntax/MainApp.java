package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine [] machines = new Machine[]{truck, bulldozer, excavator};
        printStartMessages(machines);
        printStopMessages(machines);
    }
    public static void printStartMessages(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
    public static void printStopMessages(Machine[] machines) {
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
