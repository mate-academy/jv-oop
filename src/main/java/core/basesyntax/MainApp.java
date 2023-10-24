package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] machines = {new Truck("Truck"), new Bulldozer("Bulldozer"),
                new Excavator("Excavator")};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

