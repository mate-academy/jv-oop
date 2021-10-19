package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Truck();
        Machine buildozer = new Truck();
        truck.doWork();
        excavator.doWork();
        buildozer.doWork();
        truck.stopWork();
        excavator.stopWork();
        buildozer.stopWork();

    }
}
