package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Machine machineBulldozer = bulldozer;
        Machine machineExcavator = excavator;
        Machine machineTruck = truck;

        Machine[] arrayMachine =new Machine []{bulldozer, excavator, truck};
        for (int i = 0; i < arrayMachine.length; i++) {
            arrayMachine[i].doWork();
            arrayMachine[i].stopWork();
        }

    }
}
