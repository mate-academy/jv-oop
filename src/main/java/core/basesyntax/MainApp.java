package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck("truck");
        Machine bulldozer = new Bulldozer("bulldozer");
        Machine excavator = new Excavator("excavator");
        Machine[] machines = new Machine[] {truck, bulldozer, excavator};

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
