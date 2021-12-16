package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine[] techniques = new Machine[3];
        techniques[0] = excavator;
        techniques[1] = truck;
        techniques[2] = bulldozer;

        for (Machine machine : techniques) {
            machine.doWork();
        }
        for (Machine machine : techniques) {
            machine.stopWork();
        }
    }
}
