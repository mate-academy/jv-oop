package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine myTruck = new Truck();
        Machine myBulldozer = new Bulldozer();
        Machine myExcavator = new Excavator();

        Machine[] myMachine = new Machine[]{myTruck, myBulldozer, myExcavator};

        for (Machine m : myMachine) {
            m.doWork();
            m.stopWork();
        }

    }

}
