package core.basesyntax;

public class MainApp {
    public static void main (String[] args) {
        Truck truck1 = new Truck();
        Excavator excavator1 = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        truck1.doWork();
        excavator1.doWork();
        bulldozer.doWork();
        truck1.stopWork();
        excavator1.stopWork();
        bulldozer.stopWork();
    }
}
