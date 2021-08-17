package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator("Excavator");
        Bulldozer bulldozer = new Bulldozer("Bulldozer");
        Truck truck = new Truck("Truck");
        truck.stopWork();
        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}
