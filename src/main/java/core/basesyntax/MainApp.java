package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer buldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        truck.doWork();
        truck.stopWork();

        buldozer.doWork();
        buldozer.stopWork();

        excavator.doWork();
        excavator.stopWork();

    }
}
