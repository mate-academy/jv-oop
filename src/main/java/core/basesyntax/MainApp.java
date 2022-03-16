package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] arr = {truck, bulldozer, excavator};

        for (Machine machine: arr) {
            machine.doWork();
        }

        for (Machine machine: arr) {
            machine.stopWork();
        }
    }
}
