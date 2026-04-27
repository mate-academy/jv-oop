package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine buldozerMachine = new Bulldozer();
        Machine truckMachine = new Truck();
        Machine excavatorMachine = new Excavator();

        Machine[] arrayOfMachines = new Machine[] { 
            buldozerMachine, truckMachine, excavatorMachine };

        for (Machine machine : arrayOfMachines) { // for-each for array
            machine.doWork();
            machine.stopWork();
        }
    }
}
