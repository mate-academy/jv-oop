package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        Machine[] listOfMachines = new Machine[] {excavator, truck, bulldozer};
        for (Machine machine : listOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
