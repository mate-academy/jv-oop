package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer("bulldozer");
        Machine truck = new Truck("truck");
        Machine excavator = new Excavator("excavator");

        bulldozer.doWork();
        bulldozer.stopWork();

        truck.doWork();
        truck.stopWork();

        excavator.doWork();
        excavator.stopWork();
    }
}
