package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator("Excavator");
        Machine bulldozer = new Bulldozer("Bulldozer");
        Machine truck = new Truck("Truck");
        excavator.doWork();
        excavator.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
        truck.doWork();
        truck.stopWork();
    }

}
