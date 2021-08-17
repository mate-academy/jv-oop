package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        Machine excavator = new Excavator();
        excavator.doWork();
        Machine truck = new Truck();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}

