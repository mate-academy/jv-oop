package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();

        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();

        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
    }
}
