package core.basesyntax;

public class MainApp {
    public void main() {
        Machine[] machines = new Machine[] {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
