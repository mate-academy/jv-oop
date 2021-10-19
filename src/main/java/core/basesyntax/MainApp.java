package core.basesyntax;

public class MainApp {
    public static void main(String[]args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}
