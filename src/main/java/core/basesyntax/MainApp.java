package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck("Truck");
        Excavator excavator = new Excavator("Excavator");
        Bulldozer bulldozer = new Bulldozer("Bulldozer");
        Machine[] machines = new Machine[] {truck, excavator, bulldozer};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
