package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck(); //create truck machine
        Machine excavator = new Excavator(); //create excavator machine
        Machine bulldozer = new Bulldozer(); //create bulldozer machine

        //create Machine class array with all machines
        Machine[] machines = new Machine[] {truck, excavator, bulldozer};

        //All machines works:
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
