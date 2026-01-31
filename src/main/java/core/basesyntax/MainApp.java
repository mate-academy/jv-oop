package core.basesyntax;

public class MainApp {

    public MainApp() {
        Machine[] machines = new Machine[]{ new Truck(), new Bulldozer(), new Excavator() };

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
