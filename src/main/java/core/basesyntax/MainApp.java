package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        // Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        Machine myTruck = new Truck();
        Machine myBulldozer = new Bulldozer();
        Machine myExcavator = new Excavator();

        Machine[] machines = {myTruck, myBulldozer, myExcavator};

        for (Machine myMachines : machines) {
        myMachines.doWork();
        myMachines.stopWork();
        }

    }
}