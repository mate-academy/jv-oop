package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine buldozer = new Buldozer();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[] {truck, buldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
        }

        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
