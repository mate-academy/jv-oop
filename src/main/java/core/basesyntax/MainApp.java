package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
