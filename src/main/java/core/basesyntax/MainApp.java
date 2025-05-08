package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Machine[] machineArray = new Machine[]{excavator, bulldozer, truck};

        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
