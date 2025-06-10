package core.basesyntax;

public class MainApp {
    public static void main() {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator exacator = new Excavator();

        truck.doWork();
        truck.stopWork();

        bulldozer.doWork();
        bulldozer.stopWork();

        exacator.doWork();
        exacator.stopWork();
    }
}
