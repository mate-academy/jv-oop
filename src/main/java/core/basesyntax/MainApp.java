package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine[] machines = new Machine[]{truck, excavator, bulldozer};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
