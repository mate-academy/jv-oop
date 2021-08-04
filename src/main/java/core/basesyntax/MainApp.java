package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        excavator.doWork();
        truck.doWork();
        bulldozer.doWork();
        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
    }
}
