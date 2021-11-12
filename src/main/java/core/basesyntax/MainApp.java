package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        for (int i = 5; i >= 0; i--) {
            truck.doWork();
            bulldozer.doWork();
            excavator.doWork();

            truck.stopWork();
            bulldozer.stopWork();
            excavator.stopWork();
        }
    }
}
