package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
