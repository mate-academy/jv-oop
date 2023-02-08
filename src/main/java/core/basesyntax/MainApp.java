package core.basesyntax;

public class MainApp {

    public static void main() {

        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine [] machines = new Machine[] {truck, bulldozer, excavator};

        for (Machine machine: machines) {
          machine.doWork();
          machine.stopWork();
        }
    }
}
