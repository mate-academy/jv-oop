package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
        }
        System.out.println();
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
