package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine[] array = new Machine[]{truck, bulldozer, excavator};
        for (Machine machine : array) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
