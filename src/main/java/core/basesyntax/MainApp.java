package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck Truck = new Truck();
        Excavator Excavator = new Excavator();
        Bulldozer Bulldozer = new Bulldozer();
        Machine[] machines = new Machine[] {Truck, Bulldozer, Excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}




