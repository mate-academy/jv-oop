package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] array = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine machine: array) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
