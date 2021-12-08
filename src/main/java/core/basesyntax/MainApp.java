package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.doWork();
        Machine truck = new Truck();
        truck.doWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();

    }

}
