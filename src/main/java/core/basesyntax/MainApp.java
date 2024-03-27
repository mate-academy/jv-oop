package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck("Truck");
        Machine bulldozer = new Bulldozer("Bulldozer");
        Machine excavator = new Excavator("Excavator");

        Machine[] machines = new Machine[]{truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
