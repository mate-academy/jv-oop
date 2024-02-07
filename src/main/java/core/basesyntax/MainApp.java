package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] cars = new Machine[]{new Excavator(), new Bulldozer(), new Truck()};

        for (Machine machine : cars) {
            machine.doWork();
        }

        for (Machine machine : cars) {
            machine.stopWork();
        }
    }

}
