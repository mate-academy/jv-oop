package core.basesyntax;

public class MainApp {
    public static void main(String[]args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine buldozer = new Buldozer();
        Machine[] allMachines = new Machine[] {excavator, truck, buldozer};
        for (Machine machine: allMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
