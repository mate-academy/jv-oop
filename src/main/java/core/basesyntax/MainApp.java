package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine escavator = new Excavator();

        Machine[] machines = new Machine[]{truck, bulldozer, escavator};

        //start working of all machines
        for (Machine machine : machines) {
            machine.doWork();
        }

        //stop to work for all machines
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }



}
