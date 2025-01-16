package core.basesyntax;


public class MainApp {

    public static void main(String[] args) {

        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();

        Machine[] allMachine = {excavator, bulldozer, truck};

        for (Machine machine : allMachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
