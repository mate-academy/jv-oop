package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
                new Excavator("Excavator"),
                new Bulldozer("Bulldozer"),
                new Truck("Truck")
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
