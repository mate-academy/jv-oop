package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        excavator.doWork();
        truck.doWork();
        bulldozer.doWork();

        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
    }
}
