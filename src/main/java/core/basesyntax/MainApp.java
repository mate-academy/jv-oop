package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.doWork();
        truck.stopWork();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        Excavator excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
    }
}
