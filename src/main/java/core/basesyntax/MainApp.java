package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();
        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}
