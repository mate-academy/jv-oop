package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldoser bulldoser = new Bulldoser();
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        bulldoser.doWork();
        truck.doWork();
        excavator.doWork();
        bulldoser.stopWork();
        truck.stopWork();
        excavator.stopWork();
    }
}
