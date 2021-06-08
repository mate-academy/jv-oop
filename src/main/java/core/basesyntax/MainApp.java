package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();

        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();

        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}
