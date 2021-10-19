package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine buildozer = new Bulldozer();
        buildozer.doWork();
        Machine excavator = new Excavator();
        excavator.doWork();
        Machine truck = new Truck();
        truck.doWork();
        buildozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}
