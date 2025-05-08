package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine buildozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        excavator.doWork();
        buildozer.doWork();
        truck.doWork();

        excavator.stopWork();
        buildozer.stopWork();
        truck.stopWork();
    }
}
