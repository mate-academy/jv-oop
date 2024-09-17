package core.basesyntax;

public class MainApp {
    public static void main(String[] machine) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        bulldozer.doWork();
        truck.stopWork();
        excavator.stopWork();
        excavator.doWork();
        bulldozer.stopWork();
        truck.stopWork();
    }

}
