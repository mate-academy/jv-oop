package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        Excavator excavator = new Excavator();
        excavator.doWork();
        Truck truck = new Truck();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}

