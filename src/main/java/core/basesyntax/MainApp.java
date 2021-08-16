package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}
