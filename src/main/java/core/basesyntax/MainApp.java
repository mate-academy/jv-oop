package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine buildozer = new Bulldozer(); //Create object Bulldozer
        Machine truck = new Truck(); //Create object Truck
        Machine excavator = new Excavator(); //Create object Excavator
        Machine[] machines = new Machine[] {buildozer, truck, excavator}; //Create Array
        for (Machine eachMachine: machines) { // loop for each item in the array
            eachMachine.doWork(); // action - doWork for each item in the array
            eachMachine.stopWork(); //action 0 stopWork for each item in the array
        }
    }
}
