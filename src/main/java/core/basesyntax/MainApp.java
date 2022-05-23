package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] array = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine : array) {
            machine.doWork();
        }
        for (Machine machine : array) {
            machine.stopWork();
        }
    }
}
