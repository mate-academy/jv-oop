package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        Truck truck = new Truck();
        truck.doWork();
        truck.stopWork();
    }
}
