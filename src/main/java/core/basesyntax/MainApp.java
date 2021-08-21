package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        // Create an object of each class
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        // Start work of all machines
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();
        // End work of all machines
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
