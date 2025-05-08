package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Excavator = new Excavator();
        Machine Bulldozer = new Bulldozer();
        Machine Truck = new Truck();
        //Start work machines
        Excavator.doWork();
        Bulldozer.doWork();
        Truck.doWork();
        //Stop work machines
        Excavator.stopWork();
        Bulldozer.stopWork();
        Truck.stopWork();
    }
}
