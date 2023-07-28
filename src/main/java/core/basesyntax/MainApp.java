package core.basesyntax;
public class MainApp {
    public MainApp() {
        String[] Machine = new String[]{"Truck", "Bulldozer", "Excavator"};
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.doWork();
        truck.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
        excavator.doWork();
        excavator.stopWork();
    }
}
