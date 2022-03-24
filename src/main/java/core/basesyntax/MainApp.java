package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] machine = new Machine[3];
        machine[0] = excavator;
        machine[1] = bulldozer;
        machine[2] = truck;

        for (Machine value : machine) {
            value.doWork();
        }
        for (Machine each : machine) {
            each.stopWork();
        }
    }
}
