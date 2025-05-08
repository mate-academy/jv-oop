package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine myTruck = new Truck();
        Machine myBulldozer = new Bulldozer();
        Machine myExcavator = new Excavator();

        myTruck.doWork();
        myBulldozer.doWork();
        myExcavator.doWork();

        myTruck.stopWork();
        myBulldozer.stopWork();
        myExcavator.stopWork();
    }
}
