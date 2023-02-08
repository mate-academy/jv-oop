package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine[] arrayOfMachines = {excavator, bulldozer, truck};
        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
