package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        final Truck truck = new Truck();
        excavator.doWork();
        excavator.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
        truck.doWork();
        truck.stopWork();
    }
}

