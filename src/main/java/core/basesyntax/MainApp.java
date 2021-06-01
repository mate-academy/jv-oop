package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] array = {new Bulldozer(),
                new Excavator(),
                new Truck()
        };
        for (Machine machine : array) {
            machine.doWork();
        }
        for (Machine machine : array) {
            machine.stopWork();
        }
    }
}
