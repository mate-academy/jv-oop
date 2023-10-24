package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavation = new Excavator();
        Machine[] machines = new Machine[]{bulldozer, truck, excavation};
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}

