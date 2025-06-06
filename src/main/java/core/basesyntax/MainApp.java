package core.basesyntax;

public class MainApp {
    public static void main(String[] agrs) {
        Machine[] machines = {new Truck(), new Excavator(), new Bulldozer()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
