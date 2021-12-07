package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine value : machine) {
            value.doWork();
            value.stopWork();
        }
        /*Machine excavator = new Machine();
        excavator.doWork();
        excavator.stopWork();
        Machine bulldozer = new Machine();
        bulldozer.doWork();
        bulldozer.stopWork();
        Machine truck = new Machine();
        truck.doWork();
        truck.stopWork();*/
    }
}
