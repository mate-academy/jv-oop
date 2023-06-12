package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Machine[] machines = new Machine[]{excavator, truck, bulldozer};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
