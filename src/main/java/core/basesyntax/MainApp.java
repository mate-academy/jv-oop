package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        truck.setName("t1");
        Machine bulldozer = new Bulldozer();
        bulldozer.setName("b1");
        Machine excavator = new Excavator();
        excavator.setName("e1");
        Machine[] machines = {truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
