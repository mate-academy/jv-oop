package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        String[] mashine = new String[] {"Truck", "Bulldozer", "Excavator"};
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
