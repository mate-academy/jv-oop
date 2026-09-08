package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] machineArray = {truck, bulldozer, excavator};

        for (Machine machine : machineArray) {
            machine.doWork();
        }
        for (Machine machine : machineArray) {
            machine.stopWork();
        }
    }
}
