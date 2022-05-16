package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine buldozzer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[]{truck, buldozzer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}