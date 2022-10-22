package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] autoPark = {new Truck("Truck"), //Machine array
                new Bulldozer("Bulldozer"),
                new Excavator("Excavator")};

        for (Machine machine: autoPark) { // calling method doWork
            machine.doWork();
            machine.stopWork();
        }
    }
}
