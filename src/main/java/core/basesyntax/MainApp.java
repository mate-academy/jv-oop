package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] scheduleOfMachines = {truck, bulldozer, excavator};
        for (Machine machine: scheduleOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
