package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        truck.doWork();
        truck.stopWork();
        excavator.doWork();
        excavator.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();

    }
}