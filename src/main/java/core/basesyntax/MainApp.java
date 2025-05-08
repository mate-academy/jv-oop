package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        Machine[] machines = new Machine[]{truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
