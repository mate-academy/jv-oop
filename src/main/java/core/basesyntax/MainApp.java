package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();

        Machine [] machine = new Machine[] { truck, bulldozer, excavator};
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();

        }
    }
}
