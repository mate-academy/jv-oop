package core.basesyntax;

public class MainApp {
    public static void main (String[] args) {
        Machine statusBulldozer = new Bulldozer();
        statusBulldozer.doWork();
        statusBulldozer.stopWork();
        Machine statusExcavator = new Excavator();
        statusExcavator.doWork();
        statusExcavator.stopWork();
        Machine statusTruck = new Truck();
        statusTruck.doWork();
        statusTruck.stopWork();
    }
}
