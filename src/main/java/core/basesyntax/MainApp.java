package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        excavator.doWork();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        Truck truck = new Truck();
        truck.doWork();
        excavator.stopWork();
        bulldozer.stopWork();
        truck.stopWork();
    }
}
