package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
                new Excavator("Excavator"),
                new Excavator("Bulldozer"),
                new Excavator("Truck")
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
