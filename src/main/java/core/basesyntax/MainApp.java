package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] autoPark = {new Truck(), //Machine array
                new Bulldozer(),
                new Excavator()};

        for (Machine machine: autoPark) { // calling method doWork
            machine.doWork();
            machine.stopWork();
        }
    }
}
