package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machineArray = {truck, bulldozer, excavator};
        for (Machine machine: machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
