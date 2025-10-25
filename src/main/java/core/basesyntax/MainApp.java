package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machines = new Machine[]{new Truck(), new Excavator(), new Bulldozer()};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
