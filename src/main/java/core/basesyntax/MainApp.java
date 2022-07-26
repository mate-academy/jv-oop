package core.basesyntax;

/**
 * Class is homework OOP Basic
 */
public class MainApp {
    public static void main(String[] args) {
        //These are all available machines.
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machines = new Machine[] {truck, bulldozer, excavator};

        //All machines do their jobs.
        for (Machine machine : machines) {
            machine.doWork();
        }

        //All machines finishes doing their jobs.
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
