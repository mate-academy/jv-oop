package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine myTruck = new Truck();
        Machine myBulldozer = new Bulldozer();
        Machine myExcavator = new Excavator();
        Machine[] machines = new Machine[] {myTruck, myBulldozer, myExcavator};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
