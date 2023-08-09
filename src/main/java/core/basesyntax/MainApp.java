package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machines) {
            System.out.println(machine.doWork());
            System.out.println(machine.stopWork());
        }
    }
}
