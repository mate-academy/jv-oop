package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine[] machinePark = {excavator, truck, bulldozer};

        for (Machine machine : machinePark) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
