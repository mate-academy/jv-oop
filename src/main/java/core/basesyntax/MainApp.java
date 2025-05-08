package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] arrayMachine = {truck, bulldozer, excavator};

        for (Machine machine: arrayMachine) {
            machine.doWork();
        }

        for (Machine machine: arrayMachine) {
            machine.stopWork();
        }
    }
}
