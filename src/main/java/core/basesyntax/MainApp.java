package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        excavator.doWork();
        excavator.stopWork();
        truck.doWork();
        truck.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
    }
}
