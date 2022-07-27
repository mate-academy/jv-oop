package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator("Excavator");
        Machine bulldozer = new Bulldozer("Bulldozer");
        Machine truck = new Truck("Truck");
        Machine[] machines = {excavator, bulldozer, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }

    }
}
