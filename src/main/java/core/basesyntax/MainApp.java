package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Machine[] array = {truck, excavator, bulldozer};
        for (Machine machine: array) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
