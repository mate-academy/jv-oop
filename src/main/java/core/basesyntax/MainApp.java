package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator("Excavator");
        Machine bulldozer = new Bulldozer("Bulldozer");
        Machine truck = new Truck("Truck");
        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();
        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}
