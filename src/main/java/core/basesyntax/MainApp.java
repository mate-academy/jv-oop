package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bullDozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] arrayOfMachines = {truck, bullDozer, excavator};

        for (int i = 0; i < arrayOfMachines.length; i++) {
            arrayOfMachines[i].doWork();
            arrayOfMachines[i].stopWork();
        }
    }
}
