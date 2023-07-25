package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Buldozer buldozer = new Buldozer();
        Excavator excavator = new Excavator();
        Machine [] machine = new Machine[] {truck, buldozer, excavator};
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopwork();
        }
    }
}
