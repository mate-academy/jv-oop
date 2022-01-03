package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck("Truck");
        Machine excavator = new Excavator("Excavator");
        Machine bulldozer = new Bulldozer("Bulldozer");

        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();

        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();

    }
}


