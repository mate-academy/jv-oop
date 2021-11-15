package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();

        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();
        excavator.stopWork();
        bulldozer.stopWork();
        truck.stopWork();
    }
}
