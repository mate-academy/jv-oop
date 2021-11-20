package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine[] allMachines = {bulldozer, excavator, truck};
        for (int i = 0; i < allMachines.length; i++) {
            allMachines[i].doWork();
            allMachines[i].stopWork();
        }
    }
}
