package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        Machine[] machines = {excavator, truck, bulldozer};

        for (Machine allMachines : machines) {
            allMachines.doWork();
            allMachines.stopWork();
        }
    }
}
