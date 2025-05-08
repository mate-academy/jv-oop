package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator("Excavator");
        Machine bulldozer = new Bulldozer("Bulldozer");
        Machine truck = new Truck("Truck");
        Machine[] machines = new Machine[] {excavator, bulldozer, truck};
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
