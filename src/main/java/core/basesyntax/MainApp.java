package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();

        truck.setName("Truck");
        bulldozer.setName("Bulldozer");
        excavator.setName("Excavator");

        Machine[] machines = {bulldozer, truck, excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
            System.out.println();
        }
    }
}
