package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine newExcavator = new Excavator();
        Machine newBulldozer = new Bulldozer();
        Machine newTruck = new Truck();
        newExcavator.doWork();
        newExcavator.stopWork();
        newBulldozer.doWork();
        newBulldozer.stopWork();
        newTruck.doWork();
        newTruck.stopWork();
    }
}
