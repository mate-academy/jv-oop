package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] mainArray = { truck, bulldozer, excavator };

        for (Machine machine : mainArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
