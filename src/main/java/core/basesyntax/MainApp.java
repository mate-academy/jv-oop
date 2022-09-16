package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        truck.setName("Truck");
        excavator.setName("Excavator");
        bulldozer.setName("Bulldozer");
        Machine[] machines = new Machine[] {truck, excavator, bulldozer};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
