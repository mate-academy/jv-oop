package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machines = new Machine[] {bulldozer, excavator, truck};
        for (int i = 0; i < machines.length; i++) {
            Machine machine = machines[i];
            machine.doWork();
            machine.stopWork();
        }
    }
}
