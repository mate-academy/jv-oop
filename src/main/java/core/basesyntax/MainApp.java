package core.basesyntax;

public class MainApp {
    public static void main(String[] arguments) {
        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
    }
}
