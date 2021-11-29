package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machines = {bulldozer, excavator,truck};
        for (Machine machine: machines) {
          machine.doWork();
        }
        for (Machine machine: machines) {
            machine.stopWork();
        }
    }
}