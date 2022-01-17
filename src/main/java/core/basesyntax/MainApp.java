package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
