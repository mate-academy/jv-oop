package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Bulldozer = new Bulldozer();
        Machine Truck = new Truck();
        Machine Excavator = new Excavator();

        Truck.setName("Truck");
        Bulldozer.setName("Bulldozer");
        Excavator.setName("Excavator");

        Machine[] machines = {Bulldozer, Truck, Excavator};
        for (Machine machine : machines){
            machine.doWork();
            machine.stopWork();
            System.out.println();
        }
    }
}
