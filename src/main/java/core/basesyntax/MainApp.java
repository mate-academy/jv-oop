package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setName("t1");
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName("b1");
        Excavator excavator = new Excavator();
        excavator.setName("e1");
        Machine[] machines = {truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
