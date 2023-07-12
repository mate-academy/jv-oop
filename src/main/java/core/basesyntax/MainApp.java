package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine [] machines = new Machine[] {bulldozer,truck,excavator};
        bulldozer.doWork();
        truck.doWork();
        excavator.doWork();
        bulldozer.stopWork();
        truck.stopWork();
        excavator.stopWork();
    }
}
